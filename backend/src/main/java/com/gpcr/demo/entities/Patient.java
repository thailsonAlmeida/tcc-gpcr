package com.gpcr.demo.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "tb_patient")
public class Patient extends Person implements Serializable {
	private static final long serialVersionUID = 1L;	
	   
    private String covenant_plan;
    private String covenant_number;
    
    @OneToMany(mappedBy = "patient")
    private List<Procedure> procedures; 
    
    public Patient() {}

	public Patient(Long id_patient, String rg, String cpf, LocalDate birth, String name, String cep, String street, int number, String city,
			String states, String phone1, String phone2, String email, String covenant_plan, String covenant_number) {
		super();
		this.id = id_patient;
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

	public Patient(Long id_patient, String cpf, LocalDate birth, String name, String email, String covenant_plan, String covenant_number) {
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

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
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
		return id;
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
		Patient other = (Patient) obj;
		return id == other.id;
	}

	

}
