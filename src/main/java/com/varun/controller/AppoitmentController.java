package com.varun.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.varun.service.AppointmentServiceImpl;
import com.varun.service.IDoctorServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/appointments")
public class AppoitmentController {	
	
	@Autowired
	private AppointmentServiceImpl appointmentservice;
	
	
	@PostMapping(value="/saveappointment")
	public AppointmentsData saveAppointmentDetails(@RequestBody AppointmentsData info)
	{
		
		appointmentservice.addAppointmentDetails(info);
		return info;
	}
	
	
//	@GetMapping("{dateofappointment}")
//	public List<AppointmentsData> getDoc(@PathVariable("dateofappointment") Date apptDate) {
//			List<AppointmentsData> test=appointmentservice.getAppointmentDetailsById(apptDate);
//
//		
//		return test;
//	}

	
	@GetMapping("{id}")
	public Optional<AppointmentsData> getAppointment(@PathVariable("id") String id) {
Optional<AppointmentsData> test=appointmentservice.getAppointmentById(id);

		
		return test;
	}
	
	@DeleteMapping("{id}")
	public String deleteAppointmentDetails(@PathVariable("id") String id) {
		String a=appointmentservice.deleteAppointmentDetailsById(id);
		return a;
		
	}
	
	
	@PutMapping("/{id}")
	public String updateAppointmentDetails(@PathVariable("id") String id,@RequestBody AppointmentsData info) {
		return appointmentservice.updateAppointmentDetailsById(id,info);
	}
}

