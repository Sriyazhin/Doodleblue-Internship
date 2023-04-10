package com.employee.management.securityconfiguration;

	import java.util.Arrays;
	import java.util.Collection;
	import java.util.List;
	import java.util.stream.Collectors;

	import org.springframework.security.core.GrantedAuthority;
	import org.springframework.security.core.authority.SimpleGrantedAuthority;
	import org.springframework.security.core.userdetails.UserDetails;

import com.employee.management.entity.Userentity;

	public class UserInfoUserDetails implements UserDetails{

		private String username;
		private String password;
		private List<GrantedAuthority> authority;
		
		public UserInfoUserDetails(Userentity userentity) {
			username = userentity.getUsername();
			password = userentity.getPassword();
			authority = Arrays.stream(userentity.getRole().split(","))
					.map(SimpleGrantedAuthority::new)
					.collect(Collectors.toList());
			
		}
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return authority;
		}

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return password;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return username;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}

	}
