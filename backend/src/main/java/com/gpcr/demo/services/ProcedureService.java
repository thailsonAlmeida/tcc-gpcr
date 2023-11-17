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

import com.gpcr.demo.dto.ProcedureDTO;
import com.gpcr.demo.entities.Procedure;
import com.gpcr.demo.repositories.ProcedureRepository;
import com.gpcr.demo.services.exceptions.DataBaseException;
import com.gpcr.demo.services.exceptions.ResouceNotFoundException;

@Service
public class ProcedureService {
	
	@Autowired
	private ProcedureRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ProcedureDTO> findAllPaged(Pageable pageable){
		Page<Procedure> list = repository.findAll(pageable);
		return list.map(x -> new ProcedureDTO(x));
	}

	@Transactional(readOnly = true)
	public ProcedureDTO findById(Long id) {
		Optional<Procedure> obj = repository.findById(id);
		Procedure entity = obj.orElseThrow(() -> new ResouceNotFoundException("Entity not found"));
		return new ProcedureDTO(entity);
	}
	
	@Transactional
	public ProcedureDTO insert(ProcedureDTO dto) {
		Procedure entity = new Procedure();
		copyDtoEntity(dto, entity);		
		entity = repository.save(entity);
		return new ProcedureDTO(entity);
	}
	

	@Transactional
	public ProcedureDTO update(Long id, ProcedureDTO dto) {
		try {
			Procedure entity = repository.getOne(id);
			copyDtoEntity(dto, entity);				
			entity = repository.save(entity);		
			return new ProcedureDTO(entity);
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
	
	private void copyDtoEntity(ProcedureDTO dto, Procedure entity) {
	    entity.setId_procedure(dto.getId_procedure()); 
	    entity.setData(dto.getData()); 
	    entity.setStart(dto.getStart()); 
	    entity.setFinish(dto.getFinish()); 
	    entity.setType(dto.getType()); 
	    entity.setStatus(dto.getStatus()); 
	    entity.setDescription(dto.getDescription());    

	}
}
