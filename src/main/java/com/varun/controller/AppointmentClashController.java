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
import com.varun.service.IClashServiceImpl;
import com.varun.service.IDoctorServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/clash")
public class AppointmentClashController {
	
	@Autowired
	private IClashServiceImpl clashservice;
	
	@Autowired
	private IClashDAO iclashdao;
	
	
	
	@GetMapping("{dateofappointment}")
	public String getDoc(@PathVariable("dateofappointment") Date dateofappointment) {
		String test=clashservice.getDocNameById(dateofappointment);

		
		return test;
	}
	
	

	
	
	
	
	
	
	
	
	

}