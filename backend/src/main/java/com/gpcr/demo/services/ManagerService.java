package com.gpcr.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gpcr.demo.dto.ManagerDTO;
import com.gpcr.demo.entities.Manager;
import com.gpcr.demo.repositories.ManagerRepository;
import com.gpcr.demo.services.exceptions.ResouceNotFoundException;


@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository repository;
	
	@Transactional(readOnly = true)
	public List<ManagerDTO> findAll(){
		List<Manager> list = repository.findAll();
		return list.stream().map(x -> new ManagerDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ManagerDTO findById(Long id) {
		Optional<Manager> obj = repository.findById(id);
		Manager entity = obj.orElseThrow(() -> new ResouceNotFoundException("Entity not found"));
		return new ManagerDTO(entity);
	}
}
