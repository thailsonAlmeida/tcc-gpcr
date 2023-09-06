package com.gpcr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpcr.demo.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>  {

}
