package com.gpcr.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name= "tb_report")
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_report;
	private String type;
	private String description;	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_procedure")
	private Procedure procedure;
	
	public Report() {}

	public Report(Long id_report, String type, String description, Procedure procedure) {
		super();
		this.id_report = id_report;
		this.type = type;
		this.description = description;
		this.procedure = procedure;
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

	public Procedure getProcedure() {
		return procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}

	public void setId_report(Long id_report) {
		this.id_report = id_report;
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
