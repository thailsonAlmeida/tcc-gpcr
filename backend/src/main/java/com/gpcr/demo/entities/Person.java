package com.gpcr.demo.entities;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
abstract class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
	String name;
	String email;
	String phone1;
	String phone2;
	String cep;
	String street;
	int number;
	String city;
	String states;
	String birth;
	String cpf;
	String rg;

}
