package com.qdz.hop.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qdz.hop.common.CommonPage;
import com.qdz.hop.common.ResponseResult;
import com.qdz.hop.dto.AdminUserParam;
import com.qdz.hop.dto.SysAdminLoginParam;
import com.qdz.hop.po.sys.po.SysAdminUser;
import com.qdz.hop.service.AdminUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/admin/")
@Api(tags = "AdminUserController", description = "后台用户管理")
public class AdminUserController {

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
	
	@Autowired
	private AdminUserService adminUserService;
	
	@ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<SysAdminUser> register(@RequestBody AdminUserParam adminUserParam) {
        SysAdminUser sysAdminUser = adminUserService.register(adminUserParam);
        if (sysAdminUser == null) {
           return ResponseResult.failed();
        }
        return ResponseResult.success(sysAdminUser);
    }
	
	@ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<Map<String, String>> login(@RequestBody SysAdminLoginParam sysAdminLoginParam) {
		String token = adminUserService.login(sysAdminLoginParam);
        if (token == null) {
           return ResponseResult.failed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return ResponseResult.success(tokenMap);
    }
	
    @ApiOperation(value = "退出登录")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> logout() {
        return ResponseResult.success(null);
    }

    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refresh-token", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<Map<String, String>> refreshToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String refreshToken = adminUserService.refreshToken(token);
        if (refreshToken == null) {
            return ResponseResult.failed("token已经过期！");
        }
        
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", refreshToken);
        tokenMap.put("tokenHead", tokenHead);
        
        return ResponseResult.success(tokenMap);
    }
    
    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<Map<String, Object>> getAdminInfo(Principal principal) {
        String username = principal.getName();
        SysAdminUser sysAdminUser = adminUserService.selectUserByUser(username);
        
        Map<String, Object> data = new HashMap<>();
        data.put("username", sysAdminUser.getUsername());
        data.put("roles", this.adminUserService.selectUserRoleStrByUserId(sysAdminUser.getId()));
        data.put("icon", sysAdminUser.getIcon());
        
        return ResponseResult.success(data);
    }
    
	@ApiOperation("获取所有用户")
	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	@ResponseBody
	public ResponseResult<CommonPage<SysAdminUser>> list(
			@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "status", required = false) Integer status,
			@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		
		List<SysAdminUser> userList = this.adminUserService.selectUserList(username, status, pageNum, pageSize);
		return ResponseResult.success(CommonPage.restPage(userList));
	}
	
	@ApiOperation("获取用户")
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseResult<SysAdminUser> role(@PathVariable String userId) {
		return ResponseResult.success(this.adminUserService.selectUserInfoByUserId(userId));
	}
	
	@ApiOperation("修改用户")
	@RequestMapping(value = "/user-update/{userId}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Integer> userUpdate(@PathVariable String userId, @RequestBody SysAdminUser sysAdminUser) {
		return ResponseResult.success(this.adminUserService.updateUserInfo(userId, sysAdminUser));
	}
	
	@ApiOperation("删除用户")
	@RequestMapping(value = "/user-delete/{userId}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Integer> userDelete(@PathVariable String userId) {
		return ResponseResult.success(this.adminUserService.delete(userId));
	}
	
	@ApiOperation("用户分配角色")
	@RequestMapping(value = "/user-allot-role", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Integer> userDelete(@RequestParam String userId, 
			@RequestParam("ids") List<String> roleIds) {
		return ResponseResult.success(this.adminUserService.userAllotRole(userId, roleIds));
	}
	
	@ApiOperation("用户名唯一校验")
	@RequestMapping(value = "/username-validate/{username}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseResult<Boolean> usernameValidate(@PathVariable String username) {
		SysAdminUser sysAdminUser = this.adminUserService.selectUserByUser(username);
		if(sysAdminUser == null) {
			return ResponseResult.success(true);
		}
		return ResponseResult.success(false);
	}
	
	
}
