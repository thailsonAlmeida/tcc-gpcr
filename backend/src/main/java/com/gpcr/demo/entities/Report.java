package com.gpcr.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_report")
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id_report;
	private String type;
	private String description;
	private Long id_procedure;
	
	public Report() {}

	public Report(String type, String description, Long id_procedure) {
		super();
		this.type = type;
		this.description = description;
		this.id_procedure = id_procedure;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Long getId_report() {
		return id_report;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_report);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		return Objects.equals(id_report, other.id_report);
	}
	
	

}
