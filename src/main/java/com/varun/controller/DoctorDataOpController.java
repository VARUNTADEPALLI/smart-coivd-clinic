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
import com.varun.repository.IDoctorRepository;
import com.varun.service.IDoctorServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/doctor")
public class DoctorDataOpController {
	
	@Autowired
	private IDoctorServiceImpl doctorservice;
	
	@Autowired
	private IDoctorRepository idoctorrepository;
	
	@PostMapping
	public String saveDocDetails(@RequestBody DoctorsData info)
	{
		
		return doctorservice.addDocDetails(info);
		
	}
	
	@DeleteMapping("{id}")
	public String deleteDocDetails(@PathVariable("id") String id)
	{
		
		return doctorservice.removeDocDetails(id);
	}
	
	
	@GetMapping("{id}")
	public DoctorsData getDoc(@PathVariable("id") String id) {
			DoctorsData test=doctorservice.getDocDetailsById(id);

		
		return test;
	}
	
	
	@GetMapping("/hospitals")
	public List<String> getHospitals() {
		List<String> test=doctorservice.getHospitalDetailsById();
		return test;
	}
	
	
	
	
	
	@GetMapping("/alldocs")
	public List<DoctorsData> getDocs()
	{
		List<DoctorsData> user=doctorservice.getAllDocs();
		
		return user;
	}
	
	@PutMapping("/updateDoctorDetails/{id}")
	public String updateDetails(@PathVariable("id") String id,@RequestBody DoctorsData info)
	{
		String inf = doctorservice.updateDocDetails(id,info);
		
        return inf;
		
		
	}
	
	
	
	
	

}