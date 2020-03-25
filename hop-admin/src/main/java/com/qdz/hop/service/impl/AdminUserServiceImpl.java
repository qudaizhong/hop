package com.qdz.hop.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.qdz.hop.bo.UserDetail;
import com.qdz.hop.common.SysStatusEnum;
import com.qdz.hop.dao.SysRolePermissionRelevancyDao;
import com.qdz.hop.dto.AdminUserParam;
import com.qdz.hop.dto.SysAdminLoginParam;
import com.qdz.hop.mapper.sys.mapper.SysAdminRoleRelevancyMapper;
import com.qdz.hop.mapper.sys.mapper.SysAdminUserMapper;
import com.qdz.hop.po.sys.po.SysAdminRole;
import com.qdz.hop.po.sys.po.SysAdminRoleRelevancy;
import com.qdz.hop.po.sys.po.SysAdminUser;
import com.qdz.hop.po.sys.po.SysAdminUserExample;
import com.qdz.hop.po.sys.po.SysPermission;
import com.qdz.hop.security.util.JwtTokenUtil;
import com.qdz.hop.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SysAdminUserMapper sysAdminUserMapper;

	@Autowired
	private SysRolePermissionRelevancyDao sysRolePermissionRelevancyDao;
	
	@Autowired
	private SysAdminRoleRelevancyMapper sysAdminRoleRelevancyMapper;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Override
	public SysAdminUser register(AdminUserParam param) {
		SysAdminUser sysAdminUser = new SysAdminUser();
		BeanUtils.copyProperties(param, sysAdminUser);

		sysAdminUser.setId(UUID.randomUUID().toString());
		sysAdminUser.setCreateTime(new Date());

		SysAdminUserExample sysAdminUserExample = new SysAdminUserExample();
		sysAdminUserExample.createCriteria().andUsernameEqualTo(param.getUsername());
		List<SysAdminUser> sysAdminUsers = sysAdminUserMapper.selectByExample(sysAdminUserExample);

		if (sysAdminUsers.size() > 0) {
			return null;
		}

		sysAdminUser.setPassword(passwordEncoder.encode(param.getPassword()));
		sysAdminUserMapper.insertSelective(sysAdminUser);
		return sysAdminUser;
	}

	@Override
	public SysAdminUser selectUserByUser(String username) {
		SysAdminUserExample example = new SysAdminUserExample();
		example.createCriteria().andUsernameEqualTo(username);

		List<SysAdminUser> sysAdminUsers = this.sysAdminUserMapper.selectByExample(example);

		if (sysAdminUsers != null && sysAdminUsers.size() > 0) {
			return sysAdminUsers.get(0);
		}
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username) {

		SysAdminUser sysAdminUser = this.selectUserByUser(username);

		if (sysAdminUser == null) {
			throw new UsernameNotFoundException("用户名或密码错误");
		}

		List<SysPermission> sysPermissions = this.getSysPermissions(sysAdminUser.getId());

		return new UserDetail(sysAdminUser, sysPermissions);
	}

	@Override
	public List<SysPermission> getSysPermissions(String userId) {
		return this.sysRolePermissionRelevancyDao.findPermissionsByUserId(userId);
	}

	@Override
	public String login(SysAdminLoginParam sysAdminLoginParam) {
		String token = null;
		
		try {
			UserDetails userDetails = loadUserByUsername(sysAdminLoginParam.getUsername());
			
			if (!passwordEncoder.matches(sysAdminLoginParam.getPassword(), userDetails.getPassword())) {
				throw new BadCredentialsException("密码不正确");
			}
			
			UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null,
					userDetails.getAuthorities());
			
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
			token = jwtTokenUtil.generateToken(userDetails);
		}catch(AuthenticationException e) {
			logger.warn("登录错误,{}", e.getMessage());
		}

		return token;
	}
	
    @Override
    public String refreshToken(String oldToken) {
        return jwtTokenUtil.refreshHeadToken(oldToken);
    }

	@Override
	public List<SysAdminRole> selectUserRolesByUserId(String userId) {
		return sysRolePermissionRelevancyDao.findRoles(userId);
	}

	@Override
	public List<String> selectUserRoleStrByUserId(String userId) {
		List<SysAdminRole> sysAdminRoles = this.selectUserRolesByUserId(userId);
		
		List<String> roleStrs = new ArrayList<String>(sysAdminRoles.size());
		
		for(SysAdminRole sysAdminRole : sysAdminRoles) {
			roleStrs.add(sysAdminRole.getRoleName());
		}
		
		return roleStrs;
	}

	@Override
	public List<SysAdminUser> selectUserList(String username, Integer status, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		SysAdminUserExample example = new SysAdminUserExample();
		SysAdminUserExample.Criteria criteria = example.createCriteria();
		
		 if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
            example.or(example.createCriteria().andNickNameLike("%" + username + "%"));
        }
        if (status != null) {
        	criteria.andStatusEqualTo(status);
        }else {
        	criteria.andStatusNotEqualTo(SysStatusEnum.DELETED.getCode());
        }
        
        example.setOrderByClause(" create_time desc");
		
		return this.sysAdminUserMapper.selectByExample(example);
	}

	@Override
	public SysAdminUser selectUserInfoByUserId(String userId) {
		return this.sysAdminUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int delete(String userId) {
		SysAdminUser record = new SysAdminUser();
		
		record.setId(userId);
		record.setStatus(SysStatusEnum.DELETED.getCode());
		
		return this.sysAdminUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int userAllotRole(String userId, List<String> roleIds) {
		SysAdminRoleRelevancy record = new SysAdminRoleRelevancy();
		record.setAdminUserId(userId);
		
		int count = 0;
		for(String roleId : roleIds) {
			record.setId(UUID.randomUUID().toString());
			record.setRoleId(roleId);
			
			count += this.sysAdminRoleRelevancyMapper.insertSelective(record);
		}
		
		return count;
	}

	@Override
	public int updateUserInfo(String userId, SysAdminUser sysAdminUser) {
		sysAdminUser.setId(userId);
		
		return this.sysAdminUserMapper.updateByPrimaryKeySelective(sysAdminUser);
	}

	
}
