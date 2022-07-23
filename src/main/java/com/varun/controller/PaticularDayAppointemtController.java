package com.varun.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.varun.entity.AppointmentsData;
import com.varun.service.AppointmentServiceImpl;
import com.varun.service.ParticularAppointmentServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController

public class PaticularDayAppointemtController {
	
	@Autowired
	private ParticularAppointmentServiceImpl particularappointmentservice;
	
	@GetMapping("/appointments/{name}/{dateofappointment}")
	public List<AppointmentsData> getAppointmentDetials(@PathVariable("name") String name,@PathVariable("dateofappointment") Date apptDate) {
			List<AppointmentsData> test=particularappointmentservice.getAppointmentDetails(name,apptDate);

		
		return test;
	}

}
