package com.gpcr.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_patient")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private Long id_patient;
    private String rg;
    private String cpf;
    private String birth;
    private String name;
    private String cep;
    private String street;
    private int number;
    private String city;
    private String states;
    private String phone1;
    private String phone2;
    private String email;    
    private String covenant_plan;
    private String covenant_number;
    
    public Patient() {}

	public Patient(String rg, String cpf, String birth, String name, String cep, String street, int number, String city,
			String states, String phone1, String phone2, String email, String covenant_plan, String covenant_number) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.birth = birth;
		this.name = name;
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.city = city;
		this.states = states;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.covenant_plan = covenant_plan;
		this.covenant_number = covenant_number;
	}

	public Patient(String cpf, String birth, String name, String email, String covenant_plan, String covenant_number) {
		super();
		this.cpf = cpf;
		this.birth = birth;
		this.name = name;
		this.email = email;
		this.covenant_plan = covenant_plan;
		this.covenant_number = covenant_number;
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

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
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

	public Long getId_patient() {
		return id_patient;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_patient);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return id_patient == other.id_patient;
	}

	

}
