package com.varun.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.entity.AppointmentsData;
import com.varun.entity.Leave;
import com.varun.repository.IReporterDAO;
import com.varun.repository.ISpecializationDAO;
import com.varun.service.IReporterServiceImpl;
import com.varun.service.ISpecializationServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/DoctorAvailability")
public class ReporterController {
	

	@Autowired
	private IReporterServiceImpl reporterservice;
	
	@Autowired
	private IReporterDAO ireporterdao;
	
	
	@GetMapping("{dateofappointment}")
	public List<Leave> getDoc(@PathVariable("dateofappointment") Date apptDate) {
			List<Leave> test=reporterservice.getDoctorDetailsById(apptDate);

		
		return test;
	}

}
