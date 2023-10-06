package com.gpcr.demo.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "tb_manager")
public class Manager extends Person implements Serializable{
	private static final long serialVersionUID = 1L;	
	   
    private String username;
    private String password;
    
    @OneToMany(mappedBy = "manager")
    private List<Procedure> procedures;
    
    public Manager() {}

	public Manager(Long id_manager, String name, String email, String phone1, String phone2, String cep, String street, int number,
			String city, String states, String birth, String cpf, String username, String password) {
		super();
		this.id = id_manager;
		this.name = name;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.city = city;
		this.states = states;
		this.birth = birth;
		this.cpf = cpf;
		this.username = username;
		this.password = password;
	}

	public Manager(Long id_manager, String email, String username, String password) {
		super();
		this.id = id_manager;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Manager(Long id_manager, String name, String email, String phone1, String phone2, String cep, String street, int number,
			String city, String states, String birth, String cpf, String rg) {
		super();
		this.id = id_manager;
		this.name = name;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.city = city;
		this.states = states;
		this.birth = birth;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public Long getId_manager() {
		return id;
	}	

	public void setId_manager(Long id_manager) {
		this.id = id_manager;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public List<Procedure> getProcedures() {
		return procedures;
	}

	public void setProcedures(List<Procedure> procedures) {
		this.procedures = procedures;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return id == other.id;
	}
    
    

}
