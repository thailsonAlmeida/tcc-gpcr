package com.gpcr.demo.dto;

import java.io.Serializable;

import com.gpcr.demo.entities.Patient;

public class PatientDTO implements Serializable{
	private static final long serialVersionUID = 1L;	
	
    private Long id;
    private String name;
    private String email;
    private String phone1;
	private String phone2;
	private String cep;
	private String street;
	private int number;
	private String city;
	private String states;
	private String birth;
	private String cpf;
	private String rg;
	private String covenant_plan;
    private String covenant_number;
    
    public PatientDTO() {}
    
	public PatientDTO(Long id, String name, String email, String phone1, String phone2, String cep, String street,
			int number, String city, String states, String birth, String cpf, String rg, String covenant_plan,
			String covenant_number) {
		super();
		this.id = id;
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
		this.covenant_plan = covenant_plan;
		this.covenant_number = covenant_number;
	}
	
	public PatientDTO(Patient entity) {
		this.id = entity.getId_patient();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.phone1 = entity.getPhone1();
		this.phone2 = entity.getPhone2();
		this.cep = entity.getCep();
		this.street = entity.getStreet();
		this.number = entity.getNumber();
		this.city = entity.getCity();
		this.states = entity.getStates();
		this.birth = entity.getBirth();
		this.cpf = entity.getCpf();
		this.rg = entity.getRg();
		this.covenant_plan = entity.getCovenant_plan();
		this.covenant_number = entity.getCovenant_number();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCovenant_plan() {
		return covenant_plan;
	}

	public void setCovenant_plan(String covenant_plan) {
		this.covenant_plan = covenant_plan;
	}

	public String getCovenant_number() {
		return covenant_number;
	}

	public void setCovenant_number(String covenant_number) {
		this.covenant_number = covenant_number;
	}
	
	
    
    

}
