package com.gpcr.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_professional")
public class Professional implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private Long id_professional;
    private String rg;
    private String cpf;
    private String registry;
    private String birth;
    private String name;
    private String cep;
    private String street;
    private int number;
    private String city;
    private String phone1;
    private String phone2;
    private String email;
    private String username;
    private String password;
    
    public Professional () {}

	public Professional(String rg, String cpf, String registry, String birth, String name, String cep, String street,
			int number, String city, String phone1, String phone2, String email, String username, String password) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.registry = registry;
		this.birth = birth;
		this.name = name;
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.city = city;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Professional(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistry() {
		return registry;
	}

	public void setRegistry(String registry) {
		this.registry = registry;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

	public Long getId_professional() {
		return id_professional;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_professional);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professional other = (Professional) obj;
		return id_professional == other.id_professional;
	}
    
    

}
