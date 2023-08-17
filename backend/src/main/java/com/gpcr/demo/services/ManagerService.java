package com.gpcr.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpcr.demo.entities.Manager;
import com.gpcr.demo.repositories.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository repository;
	
	public List<Manager> findAll(){
		return repository.findAll();
	}
}
