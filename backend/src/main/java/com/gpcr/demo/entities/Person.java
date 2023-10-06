package com.gpcr.demo.entities;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

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
