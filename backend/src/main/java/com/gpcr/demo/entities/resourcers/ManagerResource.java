package com.gpcr.demo.entities.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gpcr.demo.entities.Manager;

@RestController
@RequestMapping(value = "/managers")
public class ManagerResource {
	
	@GetMapping
	public ResponseEntity<List<Manager>> findAll(){
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1L, "Thais", "thais@gmail.com", "(15) 9 9816-7898", null, "18555-986", "Rua A", 5, "Street A", "States A", "13/12/1994", "405.698.698-89"));
		list.add(new Manager(2L, "Thailson", "thailson@gmail.com", "(15) 9 9816-7898", null, "18555-986", "Rua A", 5, "Street A", "States A", "13/12/1994", "405.698.698-89"));
		return ResponseEntity.ok().body(list);
	}
}
