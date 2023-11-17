package com.gpcr.demo.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.gpcr.demo.entities.Manager;
import com.gpcr.demo.entities.Patient;
import com.gpcr.demo.entities.Procedure;
import com.gpcr.demo.entities.Professional;

public class ProcedureDTO implements Serializable{
	private static final long serialVersionUID = 1L;

    private Long id_procedure;
    private LocalDate data;
    private LocalDateTime start;
    private LocalDateTime finish;
    private String type;
    private String status;
    private String description;
    

    private Professional id_professional;
    private Patient id_patient;
    private Manager id_manager;
    
    public ProcedureDTO() {}

	public ProcedureDTO(Long id_procedure, LocalDate data, LocalDateTime start, LocalDateTime finish, String type,
			String status, String description) {
		super();
		this.id_procedure = id_procedure;
		this.data = data;
		this.start = start;
		this.finish = finish;
		this.type = type;
		this.status = status;
		this.description = description;
	}
	
	public ProcedureDTO(Long id_procedure, LocalDate data, LocalDateTime start, LocalDateTime finish, String type,
			String status, String description, Professional professional) {
		super();
		this.id_procedure = id_procedure;
		this.data = data;
		this.start = start;
		this.finish = finish;
		this.type = type;
		this.status = status;
		this.description = description;
		this.id_professional = professional;
	}


	public ProcedureDTO(Procedure entity) {
		super();
		this.id_procedure = entity.getId_procedure();
		this.data = entity.getData();
		this.start = entity.getStart();
		this.finish = entity.getFinish();
		this.type = entity.getType();
		this.status = entity.getStatus();
		this.description = entity.getDescription();
	}

	public Long getId_procedure() {
		return id_procedure;
	}

	public void setId_procedure(Long id_procedure) {
		this.id_procedure = id_procedure;
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

	public Professional getId_professional() {
		return id_professional;
	}

	public void setId_professional(Professional id_professional) {
		this.id_professional = id_professional;
	}

	public Patient getId_patient() {
		return id_patient;
	}

	public void setId_patient(Patient id_patient) {
		this.id_patient = id_patient;
	}

	public Manager getId_manager() {
		return id_manager;
	}




	public void setId_manager(Manager id_manager) {
		this.id_manager = id_manager;
	}




}
