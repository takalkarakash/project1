package com.cognizant.pharmaWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.pharmaWeb.entities.Medical;

public interface MedicalRepository extends JpaRepository<Medical,Integer>{

}
