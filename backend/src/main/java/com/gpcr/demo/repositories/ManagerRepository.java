package com.gpcr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpcr.demo.entities.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
