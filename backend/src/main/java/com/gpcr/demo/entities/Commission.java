package com.gpcr.demo.entities;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_comission")
public class Commission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_comission;
    private Double money;
    private String status;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_procedure")
    private Procedure procedure;
    
    public Commission() {}

	public Commission(Double money, String status, Procedure id_procedure) {
		super();
		this.money = money;
		this.status = status;
		this.procedure = id_procedure;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Procedure getId_procedure() {
		return procedure;
	}

	public void setId_procedure(Procedure id_procedure) {
		this.procedure = id_procedure;
	}

	public Long getId_comission() {
		return id_comission;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_comission);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commission other = (Commission) obj;
		return Objects.equals(id_comission, other.id_comission);
	}
	
    
    

}
