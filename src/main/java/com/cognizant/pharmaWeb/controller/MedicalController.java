package com.cognizant.pharmaWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.pharmaWeb.entities.Medical;
import com.cognizant.pharmaWeb.services.MedicalService;

@Controller
public class MedicalController {

	@Autowired
	MedicalService service;
	
	@GetMapping("/medicaldata")
	public String showCreateLocation() {
		return "medicaldata";
	}
	
	@PostMapping("/saveData")
	public String saveLocation(@ModelAttribute("medicalData") Medical medicalData,ModelMap modelMap) {
		
		Medical savedLocation=service.saveMedical(medicalData);
		String msg="Location saved id in: "+savedLocation.getMedicine_name();
		modelMap.addAttribute("msg",msg);
		return "medicaldata";
		
	}
	
	@GetMapping("/displayMedicalData")
	public String getAllLocations(Model theModel) {
		
		List<Medical> listOfLocations=service.getAllMedicals();
		theModel.addAttribute("listOfLocations",listOfLocations);
		return "displayMedicalData";
	}
	@GetMapping("/deleteMedicalData")
	public String deleteLocation(@RequestParam("id") int theId,Model theModel) {
		
		Medical location=service.getMedicalById(theId);
		service.deleteMedical(location);
		/*
		 * List<Location> listOfLocations=service.getAllLocations();
		 * theModel.addAttribute("listOfLocations",listOfLocations); return
		 * "displayLocations";
		 */
		return "redirect:displayMedicalData";
	}
	@GetMapping("/editMedicalData")
	public String editLocation(@RequestParam("id") int theId,Model theModel) {
		
		Medical theLocation=service.getMedicalById(theId);
		theModel.addAttribute("location", theLocation);
		return "updateMedicalData";
	}
	@PostMapping("/updateMedical")
	public String updateMedical(@ModelAttribute("location") Medical location) {
		service.updateMedical(location);
		return "redirect:displayMedicalData";
	}
	
	
}
