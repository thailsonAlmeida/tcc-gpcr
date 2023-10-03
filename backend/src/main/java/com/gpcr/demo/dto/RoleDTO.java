package com.gpcr.demo.dto;

import java.io.Serializable;

import com.gpcr.demo.entities.Role;

import jakarta.validation.constraints.NotBlank;

public class RoleDTO implements Serializable{
	private static final long serialVersionUID = 1L;	
	private Long id;
	
	@NotBlank(message = "Campo obigatório")
	private String authority;
	
	public RoleDTO() {}

	public RoleDTO(Long id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}
	
	public RoleDTO(Role role) {
		super();
		id = role.getId();
		authority = role.getAuthority();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	
}
