package com.qdz.hop.service;

import java.util.List;

import com.qdz.hop.po.sys.po.SysAdminRole;
import com.qdz.hop.po.sys.po.SysPermission;

public interface AdminRoleService {

	int save(SysAdminRole sysAdminRole);
	
	int delete(List<String> ids);
	
	int deleteReal(List<String> ids);
	
	List<SysPermission> selectPermissionList(String roleId);
	
	int updateRolePermission(String roleId, List<String> sysPermissions);
	
	List<SysAdminRole> selectRoleList(String name, Integer status, Integer pageNum, Integer pageSize);
	
	SysAdminRole getRoleById(String roleId);
}
