package com.gpcr.demo.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_comission")
public class Commission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_comission;
    private Double money;
    private String status;
    private Long id_procedure;
    
    public Commission() {}

	public Commission(Double money, String status, Long id_procedure) {
		super();
		this.money = money;
		this.status = status;
		this.id_procedure = id_procedure;
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

	public Long getId_procedure() {
		return id_procedure;
	}

	public void setId_procedure(Long id_procedure) {
		this.id_procedure = id_procedure;
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
