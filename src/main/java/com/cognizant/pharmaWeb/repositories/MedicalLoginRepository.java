package com.cognizant.pharmaWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.pharmaWeb.entities.MedicalLogin;

public interface MedicalLoginRepository extends JpaRepository<MedicalLogin,String> {

}
