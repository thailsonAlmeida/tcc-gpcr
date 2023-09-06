package com.gpcr.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gpcr.demo.dto.PatientDTO;
import com.gpcr.demo.entities.Patient;
import com.gpcr.demo.repositories.PatientRepository;
import com.gpcr.demo.services.exceptions.DataBaseException;
import com.gpcr.demo.services.exceptions.ResouceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository repository;

	@Transactional(readOnly = true)
	public Page<PatientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Patient> list = repository.findAll(pageRequest);
		return list.map(x -> new PatientDTO(x));
	}

	@Transactional(readOnly = true)
	public PatientDTO findById(Long id) {
		Optional<Patient> obj = repository.findById(id);
		Patient entity = obj.orElseThrow(() -> new ResouceNotFoundException("Entity not found"));
		return new PatientDTO(entity);
	}

	@Transactional
	public PatientDTO insert(PatientDTO dto) {
		Patient entity = new Patient();
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
		entity.setCovenant_number(dto.getCovenant_number());		
		entity.setCovenant_plan(dto.getCovenant_plan());   
	    entity = repository.save(entity);
		return new PatientDTO(entity);
	}

	@Transactional
	public PatientDTO update(Long id, PatientDTO dto) {
		try{
			Patient entity = repository.getReferenceById(id);
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
			entity.setCovenant_number(dto.getCovenant_number());		
			entity.setCovenant_plan(dto.getCovenant_plan()); 
		    entity = repository.save(entity);
			return new PatientDTO(entity);			
		}catch (EntityNotFoundException e) {
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
}
