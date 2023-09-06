package com.gpcr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpcr.demo.entities.Professional;

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional, Long> {

}
