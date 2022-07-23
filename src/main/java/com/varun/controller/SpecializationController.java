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
import com.varun.entity.Leave;
import com.varun.repository.IClashDAO;
import com.varun.repository.IDoctorRepository;
import com.varun.repository.ISpecializationDAO;
import com.varun.service.IClashServiceImpl;
import com.varun.service.IDoctorServiceImpl;
import com.varun.service.ISpecializationServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/specialization")
public class SpecializationController {
	
	@Autowired
	private ISpecializationServiceImpl specializationservice;
	
	@Autowired
	private ISpecializationDAO ispecializationdao;
	
	
	
	@GetMapping("{hospital}")
	public List<String> getSpecialization(@PathVariable("hospital") String hospitals) {
		List<String> test=specializationservice.getSpecializationById(hospitals);

		
		return test;
	}
	
	@GetMapping("{hospital}/{specialization}")
	public List<DoctorsData> getDoctor(@PathVariable("hospital") String hospitals,@PathVariable("specialization") String specializations) {
		List<DoctorsData> test=specializationservice.getDoctorsById(hospitals,specializations);

		
		return test;
	}
	
	

	
	
	
	
	
	
	
	
	

}