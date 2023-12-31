package com.gpcr.demo.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gpcr.demo.dto.ManagerDTO;
import com.gpcr.demo.entities.Manager;
import com.gpcr.demo.repositories.ManagerRepository;
import com.gpcr.demo.services.exceptions.DataBaseException;
import com.gpcr.demo.services.exceptions.ResouceNotFoundException;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ManagerDTO> findAllPaged(Pageable pageable){
		Page<Manager> list = repository.findAll(pageable);
		return list.map(x -> new ManagerDTO(x));
	}

	@Transactional(readOnly = true)
	public ManagerDTO findById(Long id) {
		Optional<Manager> obj = repository.findById(id);
		Manager entity = obj.orElseThrow(() -> new ResouceNotFoundException("Entity not found"));
		return new ManagerDTO(entity);
	}
	
	@Transactional
	public ManagerDTO insert(ManagerDTO dto) {
		Manager entity = new Manager();
		copyDtoEntity(dto, entity);		
		entity = repository.save(entity);
		return new ManagerDTO(entity);
	}
	

	@Transactional
	public ManagerDTO update(Long id, ManagerDTO dto) {
		try {
			Manager entity = repository.getOne(id);
			copyDtoEntity(dto, entity);				
			entity = repository.save(entity);		
			return new ManagerDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResouceNotFoundException("ID not found " + id);
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResouceNotFoundException("ID not found " + id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataBaseException("Integreity violation");
		}
	}
	
	private void copyDtoEntity(ManagerDTO dto, Manager entity) {
		entity.setName(dto.getName());
		entity.setBirth(dto.getBirth());
		entity.setCpf(dto.getCep());
		entity.setRg(dto.getRg());
		entity.setPhone1(dto.getPhone1());
		entity.setPhone2(dto.getPhone2());
		entity.setCep(dto.getCep());
		entity.setStreet(dto.getStreet());
		entity.setNumber(dto.getNumber());
		entity.setCity(dto.getCity());
		entity.setStates(dto.getStates());
		entity.setEmail(dto.getEmail());	
	}
}
