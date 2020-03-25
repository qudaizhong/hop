package com.qdz.hop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qdz.hop.common.CommonPage;
import com.qdz.hop.common.ResponseResult;
import com.qdz.hop.po.sys.po.SysAdminRole;
import com.qdz.hop.po.sys.po.SysPermission;
import com.qdz.hop.service.AdminRoleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 后台用户角色管理
 */
@Controller
@Api(tags = "AdminRoleController", description = "后台用户角色管理")
@RequestMapping("/role")
public class AdminRoleController {

	@Autowired
	private AdminRoleService adminRoleService;

	@ApiOperation("创建角色")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Integer> create(@RequestBody SysAdminRole sysAdminRole) {
		int count = adminRoleService.save(sysAdminRole);
		if (count > 0) {
			return ResponseResult.success(count);
		}
		return ResponseResult.failed();
	}

	@ApiOperation("修改角色")
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Integer> update(@PathVariable String id, @RequestBody SysAdminRole sysAdminRole) {
		sysAdminRole.setId(id);
		int count = adminRoleService.save(sysAdminRole);
		if (count > 0) {
			return ResponseResult.success(count);
		}
		return ResponseResult.failed();
	}

	@ApiOperation("批量删除角色")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Integer> delete(@RequestParam("ids") List<String> ids) {
		int count = adminRoleService.delete(ids);
		if (count > 0) {
			return ResponseResult.success(count);
		}
		return ResponseResult.failed();
	}

	@ApiOperation("获取相应角色权限")
	@RequestMapping(value = "/permission/{roleId}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseResult<List<SysPermission>> getPermissionList(@PathVariable String roleId) {
		List<SysPermission> permissionList = this.adminRoleService.selectPermissionList(roleId);
		return ResponseResult.success(permissionList);
	}

	@ApiOperation("修改角色权限")
	@RequestMapping(value = "/permission/update", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Integer> updatePermission(@RequestParam String roleId,
			@RequestParam("permissionIds") List<String> permissionIds) {
		int count = adminRoleService.updateRolePermission(roleId, permissionIds);
		if (count > 0) {
			return ResponseResult.success(count);
		}
		return ResponseResult.failed();
	}

	@ApiOperation("获取所有角色")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResponseResult<CommonPage<SysAdminRole>> list(
			@RequestParam(value = "roleName", required = false) String name,
			@RequestParam(value = "status", required = false) Integer status,
			@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		
		List<SysAdminRole> roleList = this.adminRoleService.selectRoleList(name, status, pageNum, pageSize);
		return ResponseResult.success(CommonPage.restPage(roleList));
	}
	
	@ApiOperation("获取角色")
	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseResult<SysAdminRole> role(@PathVariable String roleId) {
		return ResponseResult.success(this.adminRoleService.getRoleById(roleId));
	}

}
