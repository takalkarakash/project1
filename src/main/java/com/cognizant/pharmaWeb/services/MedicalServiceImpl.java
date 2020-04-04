package com.cognizant.pharmaWeb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cognizant.pharmaWeb.entities.Medical;
import com.cognizant.pharmaWeb.repositories.MedicalRepository;

@Service
public class MedicalServiceImpl implements MedicalService {

	@Autowired
	private MedicalRepository repository;
	public MedicalRepository getRepository() {
		return repository;
	}

	public void setRepository(MedicalRepository repository) {
		this.repository = repository;
	}

	@Override
	public Medical saveMedical(Medical medical) {
		return getRepository().save(medical);
	}

	@Override
	public Medical updateMedical(Medical medical) {
		return getRepository().save(medical);
	}

	@Override
	public Medical getMedicalById(int id) {
		Optional<Medical> op=getRepository().findById(id);
		Medical loc;
		loc=op.get();
		return loc;
	}

	@Override
	public void deleteMedical(Medical medical) {
		getRepository().delete(medical);
		
	}

	@Override
	public List<Medical> getAllMedicals() {
		
		return getRepository().findAll();
	}

}
