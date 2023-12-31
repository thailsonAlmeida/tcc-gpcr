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

import com.gpcr.demo.dto.ProfessionalDTO;
import com.gpcr.demo.entities.Professional;
import com.gpcr.demo.repositories.ProfessionalRepository;
import com.gpcr.demo.services.exceptions.DataBaseException;
import com.gpcr.demo.services.exceptions.ResouceNotFoundException;

@Service
public class ProfessionalService {	
	
	@Autowired
	private ProfessionalRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ProfessionalDTO> findAllPaged(Pageable pageable){
		Page<Professional> list = repository.findAll(pageable);
		return list.map(x -> new ProfessionalDTO(x));
	}

	@Transactional(readOnly = true)
	public ProfessionalDTO findById(Long id) {
		Optional<Professional> obj = repository.findById(id);
		Professional entity = obj.orElseThrow(() -> new ResouceNotFoundException("Entity not found"));
		return new ProfessionalDTO(entity);
	}

	@Transactional
	public ProfessionalDTO insert(ProfessionalDTO dto) {
		Professional entity = new Professional();
		copyDtoEntity(dto, entity);		
	    entity = repository.save(entity);
		return new ProfessionalDTO(entity);
	}	
	

	@Transactional
	public ProfessionalDTO update(Long id, ProfessionalDTO dto) {
		try{
			Professional entity = repository.getOne(id);
			copyDtoEntity(dto, entity);	
		    entity = repository.save(entity);
			return new ProfessionalDTO(entity);			
		}catch (EntityNotFoundException e) {
			throw new ResouceNotFoundException("ID not found " + id);
		}
	}
	
	private void copyDtoEntity(ProfessionalDTO dto, Professional entity) {
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPhone1(dto.getPhone1());
		entity.setPhone2(dto.getPhone2());
		entity.setCep(dto.getCep());
		entity.setStreet(dto.getStreet());
		entity.setNumber(dto.getNumber());
		entity.setCity(dto.getCity());
		entity.setStates(dto.getStates());
		entity.setBirth(dto.getBirth());
		entity.setCpf(dto.getCpf());
		entity.setRg(dto.getRg());
		entity.setRegistry(dto.getRegistry());
		
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
}
