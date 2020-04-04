package com.cognizant.pharmaWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.pharmaWeb.entities.MedicalLogin;
import com.cognizant.pharmaWeb.repositories.MedicalLoginRepository;


@Service
public class MedicalLoginServiceImpl implements MedicalLoginService {

	@Autowired
	private MedicalLoginRepository repository;
	@Override
	public MedicalLogin saveMedicalLogin(MedicalLogin medicalLogin) {
		
		return getRepository().save(medicalLogin);
	}
	public MedicalLoginRepository getRepository() {
		return repository;
	}
	public void setRepository(MedicalLoginRepository repository) {
		this.repository = repository;
	}

}
