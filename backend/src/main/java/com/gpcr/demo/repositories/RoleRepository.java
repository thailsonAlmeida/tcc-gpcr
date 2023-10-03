package com.gpcr.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpcr.demo.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
