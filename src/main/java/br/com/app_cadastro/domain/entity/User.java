package br.com.app_cadastro.domain.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
@Data
@Entity
@Table (name = "user")
public class User implements UserDetails {


	private static final long serialVersionUID = 1L;
	
	
	@id
	@Gene
	private Long id;
	private String userName;
	private String fullName;
	private String password;
	private Boolean accountNonExpired;
	private Boolean accountNonLocked;
	private Boolean credentialNonExpired;
	private Boolean enable;

	
	
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
