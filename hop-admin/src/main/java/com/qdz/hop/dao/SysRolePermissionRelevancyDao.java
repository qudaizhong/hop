package com.qdz.hop.dao;

import java.util.List;

import com.qdz.hop.po.sys.po.SysAdminRole;
import com.qdz.hop.po.sys.po.SysPermission;
import com.qdz.hop.po.sys.po.SysRolePernissionRelevancy;

public interface SysRolePermissionRelevancyDao {
	
	List<SysPermission> findPermissionsByUserId(String userId);
	
	List<SysAdminRole> findRoles(String userId);

	List<SysPermission> findPermissionsByRoleID(String roleId);
	
	int insertPermissionRelevancyList(List<SysRolePernissionRelevancy> sysRolePernissionRelevancies);
}
