package com.gpcr.demo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tb_procedure")
public class Procedure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_procedure;
    private LocalDate data;
    private LocalDateTime start;
    private LocalDateTime finish;
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
    
	public Procedure(LocalDate data, LocalDateTime start, LocalDateTime finish, String type, String status, String description,
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
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
