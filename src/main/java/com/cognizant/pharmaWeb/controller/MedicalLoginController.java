package com.cognizant.pharmaWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.cognizant.pharmaWeb.entities.MedicalLogin;
import com.cognizant.pharmaWeb.services.MedicalLoginService;


@Controller
public class MedicalLoginController {

	@Autowired
	MedicalLoginService service;
	

	@GetMapping("/homepage")
	public String showHomePage() {
		
		return "homepage";
	}
	
	@PostMapping("/doAction")
	public String saveLocation(@ModelAttribute("medicalLogin")MedicalLogin medical,ModelMap modelMap) {
		
		MedicalLogin savedLocation=service.saveMedicalLogin(medical);
		String msg="Data saved id in: "+savedLocation.getUserName();
		modelMap.addAttribute("msg",msg);
		return "medicaldata";
		
	}
	
}
