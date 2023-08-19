package com.gpcr.demo.resourcers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gpcr.demo.dto.ManagerDTO;
import com.gpcr.demo.services.ManagerService;

@RestController
@RequestMapping(value = "/managers")
public class ManagerResource {
	
	@Autowired
	private ManagerService service;
	
	@GetMapping
	public ResponseEntity<List<ManagerDTO>> findAll(){
		List<ManagerDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
