package com.varun.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.entity.AppointmentsData;
import com.varun.entity.DoctorsData;
import com.varun.entity.PatientData;
import com.varun.repository.IDoctorRepository;
import com.varun.repository.IPatientRepository;
import com.varun.service.IDoctorServiceImpl;
import com.varun.service.IPatientServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/patient")
public class PatientDataController {
	
	@Autowired
	private IPatientServiceImpl patientservice;
	
	@Autowired
	private IPatientRepository ipatientepository;
	
	@PostMapping
	public String savePatientDetails(@RequestBody PatientData info)
	{
		
		return patientservice.addPatientDetails(info);
		 
	}
	
	@DeleteMapping("{id}")
	public void deletePatientDetails(@PathVariable("id") String id)
	{
		
		patientservice.removePatientDetails(id);
	}
	
	@GetMapping("{id}")
	public PatientData getDoc(@PathVariable("id") String id) {
			PatientData test=patientservice.getPatientDetailsById(id);

		
		return test;
	}
	
	@PutMapping("/updatePatientDetails/{id}")
	public String updatePatientDetails(@PathVariable("id") String id,@RequestBody PatientData info)
	{
		String inf = patientservice.updatePatientDetails(id,info);
		
        return inf;
		
		
	}
	
	
	
	
	

}