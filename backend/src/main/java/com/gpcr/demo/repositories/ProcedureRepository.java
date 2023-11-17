package com.gpcr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpcr.demo.entities.Procedure;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Long>  {

}
