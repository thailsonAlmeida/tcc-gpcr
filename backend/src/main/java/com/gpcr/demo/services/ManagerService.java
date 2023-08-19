package com.gpcr.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gpcr.demo.dto.ManagerDTO;
import com.gpcr.demo.entities.Manager;
import com.gpcr.demo.repositories.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository repository;
	
	@Transactional(readOnly = true)
	public List<ManagerDTO> findAll(){
		List<Manager> list = repository.findAll();
		return list.stream().map(x -> new ManagerDTO(x)).collect(Collectors.toList());
	}
}
