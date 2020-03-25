package com.qdz.hop.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.qdz.hop.common.SysStatusEnum;
import com.qdz.hop.dao.SysRolePermissionRelevancyDao;
import com.qdz.hop.mapper.sys.mapper.SysAdminRoleMapper;
import com.qdz.hop.mapper.sys.mapper.SysPermissionMapper;
import com.qdz.hop.mapper.sys.mapper.SysRolePernissionRelevancyMapper;
import com.qdz.hop.po.sys.po.SysAdminRole;
import com.qdz.hop.po.sys.po.SysAdminRoleExample;
import com.qdz.hop.po.sys.po.SysPermission;
import com.qdz.hop.po.sys.po.SysRolePernissionRelevancy;
import com.qdz.hop.po.sys.po.SysRolePernissionRelevancyExample;
import com.qdz.hop.service.AdminRoleService;

import cn.hutool.core.lang.UUID;

@Service
public class AdminRoleServiceImpl implements AdminRoleService {

	@Autowired
	private SysAdminRoleMapper sysAdminRoleMapper;
	
	@Autowired
	private SysPermissionMapper sysPermissionMapper;
	
	@Autowired
	private SysRolePernissionRelevancyMapper sysRolePernissionRelevancyMapper;
	
	@Autowired
	private SysRolePermissionRelevancyDao sysRolePermissionRelevancyDao;

	@Override
	public int save(SysAdminRole sysAdminRole) {
		int count = 0;
		// 新增
		Date now = new Date();
		sysAdminRole.setUpdateTime(now);
		if(StringUtils.isEmpty(sysAdminRole.getId())) {
			sysAdminRole.setId(UUID.randomUUID().toString());
			sysAdminRole.setCreateTime(now);
			count = this.sysAdminRoleMapper.insertSelective(sysAdminRole);
		}else {
			count = this.sysAdminRoleMapper.updateByPrimaryKeySelective(sysAdminRole);
		}
		return count;
	}

	@Override
	public int delete(List<String> ids) {
		SysAdminRole record = new SysAdminRole();
		// 删除
		record.setStatus(SysStatusEnum.DELETED.getCode()); 
		
		SysAdminRoleExample example = new SysAdminRoleExample();
		example.createCriteria().andIdIn(ids);
		return this.sysAdminRoleMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int deleteReal(List<String> ids) {
		SysAdminRoleExample example = new SysAdminRoleExample();
		example.createCriteria().andIdIn(ids);
		return this.sysAdminRoleMapper.deleteByExample(example);
	}

	@Override
	public List<SysPermission> selectPermissionList(String roleId) {
		return this.sysRolePermissionRelevancyDao.findPermissionsByRoleID(roleId);
	}

	@Override
	public int updateRolePermission(String roleId, List<String> sysPermissionsIds) {
		// 删除原有权限
		SysRolePernissionRelevancyExample example = new SysRolePernissionRelevancyExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		this.sysRolePernissionRelevancyMapper.deleteByExample(example);
		
		List<SysRolePernissionRelevancy> sysRolePernissionRelevancies = new ArrayList<>();
		for (String permissionId : sysPermissionsIds) {
			SysRolePernissionRelevancy sysRolePernissionRelevancy = new SysRolePernissionRelevancy();
			sysRolePernissionRelevancy.setRoleId(roleId);
			sysRolePernissionRelevancy.setPermissionId(permissionId);
			sysRolePernissionRelevancy.setId(UUID.randomUUID().toString());
		}
		
		return this.sysRolePermissionRelevancyDao.insertPermissionRelevancyList(sysRolePernissionRelevancies);
	}

	@Override
	public List<SysAdminRole> selectRoleList(String name, Integer status, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		SysAdminRoleExample example = new SysAdminRoleExample();
		SysAdminRoleExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(name)) {
            criteria.andRoleNameLike("%" + name + "%");
            example.or(example.createCriteria().andDescriptionLike("%" + name + "%"));
        }
        if (status != null) {
        	criteria.andStatusEqualTo(status);
        }else {
        	criteria.andStatusNotEqualTo(SysStatusEnum.DELETED.getCode());
        }
        
        example.setOrderByClause(" sort_number desc");
		
		return this.sysAdminRoleMapper.selectByExample(example);
	}

	@Override
	public SysAdminRole getRoleById(String roleId) {
		return this.sysAdminRoleMapper.selectByPrimaryKey(roleId);
	}
	
	
}
