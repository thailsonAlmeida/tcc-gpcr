package com.gpcr.demo.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_pocedure")
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
    
    private int id_professional;
    private int id_patient;
    private int id_manager;
    
    public Procedure() {}
    
	public Procedure(String data, String start, String finish, String type, String status, String description,
			int id_professional, int id_patient, int id_manager) {
		super();
		this.data = data;
		this.start = start;
		this.finish = finish;
		this.type = type;
		this.status = status;
		this.description = description;
		this.id_professional = id_professional;
		this.id_patient = id_patient;
		this.id_manager = id_manager;
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

	public int getId_professional() {
		return id_professional;
	}

	public void setId_professional(int id_professional) {
		this.id_professional = id_professional;
	}

	public int getId_patient() {
		return id_patient;
	}

	public void setId_patient(int id_patient) {
		this.id_patient = id_patient;
	}

	public Long getId_procedure() {
		return id_procedure;
	}

	public int getId_manager() {
		return id_manager;
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
