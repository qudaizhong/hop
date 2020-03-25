package com.qdz.hop.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.qdz.hop.dto.AdminUserParam;
import com.qdz.hop.dto.SysAdminLoginParam;
import com.qdz.hop.po.sys.po.SysAdminRole;
import com.qdz.hop.po.sys.po.SysAdminUser;
import com.qdz.hop.po.sys.po.SysPermission;

public interface AdminUserService {

	SysAdminUser register(AdminUserParam param);
	
	SysAdminUser selectUserByUser(String username);
	
	List<SysAdminRole> selectUserRolesByUserId(String userId);
	
	List<String> selectUserRoleStrByUserId(String userId);
	
	UserDetails loadUserByUsername(String username);
	
	List<SysPermission> getSysPermissions(String userId);
	
	/**
	 * 用户登录
	 * @author qdz
	 * @createDate 2020年3月9日 上午11:43:05
	 * @updateDate 2020年3月9日 上午11:43:05
	 * @version 1.0
	 * @param sysAdminLoginParam
	 * @return
	 */
	String login(SysAdminLoginParam sysAdminLoginParam);
	
	String refreshToken(String oldToken);
	
	List<SysAdminUser> selectUserList(String username, Integer status, Integer pageNum, Integer pageSize);
	
	SysAdminUser selectUserInfoByUserId(String userId);
	
	int delete(String userId);
	
	int userAllotRole(String userId, List<String> roleIds);
	
	int updateUserInfo(String userId, SysAdminUser sysAdminUser);
	
}
