package com.cognizant.pharmaWeb.services;

import java.util.List;

import com.cognizant.pharmaWeb.entities.Medical;



public interface MedicalService {

	Medical saveMedical(Medical medical);
	Medical updateMedical(Medical medical);
	Medical getMedicalById(int id);
	void deleteMedical(Medical medical);
	List<Medical> getAllMedicals();
	
}
