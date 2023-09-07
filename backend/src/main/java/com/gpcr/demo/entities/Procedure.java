package com.gpcr.demo.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_procedure")
public class Procedure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_procedure;
    private String data;
    private String start;
    private String finish;
    private String type;
    private String status;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "id_professional", nullable = false)
    private Professional professional;
    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "id_manager", nullable = false)
    private Manager manager;
    
    public Procedure() {}
    
	public Procedure(String data, String start, String finish, String type, String status, String description,
			Professional professional, Patient patient, Manager manager) {
		super();
		this.data = data;
		this.start = start;
		this.finish = finish;
		this.type = type;
		this.status = status;
		this.description = description;
		this.professional = professional;
		this.patient = patient;
		this.manager = manager;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	public Long getId_procedure() {
		return id_procedure;
	}

	public void setId_procedure(Long id_procedure) {
		this.id_procedure = id_procedure;
	}	

	public Professional getProfessional() {
		return professional;
	}

	public void setProfessional(Professional professional) {
		this.professional = professional;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_procedure);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Procedure other = (Procedure) obj;
		return Objects.equals(id_procedure, other.id_procedure);
	}
}
