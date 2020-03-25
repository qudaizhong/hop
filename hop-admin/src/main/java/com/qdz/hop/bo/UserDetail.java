package com.qdz.hop.bo;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.qdz.hop.po.sys.po.SysAdminUser;
import com.qdz.hop.po.sys.po.SysPermission;

public class UserDetail implements UserDetails {

	private static final long serialVersionUID = 1L;
	private SysAdminUser sysAdminUser;
	private List<SysPermission> sysPermissions;

	public UserDetail (SysAdminUser sysAdminUser, List<SysPermission> sysPermissions) {
		this.sysAdminUser = sysAdminUser;
		this.sysPermissions = sysPermissions;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return sysPermissions.stream().filter(permission -> permission.getValue() != null)
				.map(permission -> new SimpleGrantedAuthority(permission.getValue())).collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return this.sysAdminUser.getPassword();
	}

	@Override
	public String getUsername() {
		return this.sysAdminUser.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
