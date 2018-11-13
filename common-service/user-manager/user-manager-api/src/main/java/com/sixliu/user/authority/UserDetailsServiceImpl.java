package com.sixliu.user.authority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.sixliu.user.constant.UserStatus;
import com.sixliu.user.dto.UserDTO;
import com.sixliu.user.dto.UserRoleDTO;
import com.sixliu.user.service.UserRoleService;
import com.sixliu.user.service.UserService;

/**
 * @author:MG01867
 * @date:2018年11月13日
 * @email:359852326@qq.com
 * @version:
 * @describe
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRoleService userRoleService;

	private Map<String, UserDetails> cache = new ConcurrentHashMap<>();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return cache.computeIfAbsent(username, newKey -> {
			UserDTO user = userService.getByName(username);
			if (null == user) {
				throw new UsernameNotFoundException(String.format("The user's name[%s] is illegal", username));
			}
			List<UserRoleDTO> userRoles = userRoleService.listByUserId(user.getId());
			List<GrantedAuthority> authorities = null;
			if (null != userRoles) {
				authorities = new ArrayList<>(userRoles.size());
				for (UserRoleDTO userRole : userRoles) {
					authorities.add(() -> userRole.getRoleId());
				}
			}
			return new UserDetailsImpl(user, authorities);
		});
	}

	public static class UserDetailsImpl implements UserDetails {

		/**
		 * 
		 */
		private static final long serialVersionUID = 934359717975074898L;
		private UserDTO user;
		private List<GrantedAuthority> authorities;

		UserDetailsImpl(UserDTO user, List<GrantedAuthority> authorities) {
			this.user = user;
			this.authorities = null == authorities ? Collections.emptyList() : authorities;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return authorities;
		}

		@Override
		public String getPassword() {
			return user.getPassword();
		}

		@Override
		public String getUsername() {
			return user.getName();
		}

		@Override
		public boolean isAccountNonExpired() {
			return user.getStatus() == UserStatus.EXPIRED;
		}

		@Override
		public boolean isAccountNonLocked() {
			return user.getStatus() == UserStatus.LOCKED;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return user.getStatus() == UserStatus.DISCARDED;
		}

		@Override
		public boolean isEnabled() {
			return user.getStatus() == UserStatus.NORMAL || user.getStatus() == UserStatus.UNCERTIFIED;
		}
	}
}
