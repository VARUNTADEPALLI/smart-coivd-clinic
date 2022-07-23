package com.varun.controller;

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

import com.varun.entity.DoctorsData;
import com.varun.entity.Registraion;
import com.varun.repository.IDoctorRepository;
import com.varun.repository.IUserRepository;

import com.varun.service.IDoctorServiceImpl;
import com.varun.service.IUserServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class RegistrationController {
	
	@Autowired
	private IUserServiceImpl userservice;
	
	@Autowired
	private IUserRepository iuserrepository;
	
	@PostMapping(value="saveUserDetails")
	public String saveUserDetails(@RequestBody Registraion info)
	
	{
		
		return  userservice.addUserDetails(info);
		
	}
	
	
	@PutMapping("/updateUserDetails/{id}")
	public String updateDetails(@PathVariable("id") String id,@RequestBody Registraion info)
	{
		String inf = userservice.updateDocDetails(id,info);
		
        return inf;
	
	}
	
	@GetMapping("findDetails/{id}")
	public Registraion getDoc(@PathVariable("id") String id) {
		 Registraion test=userservice.findDocId(id);

		
		return test;
	}
	
	
	@GetMapping("findAllDetails")
	public List<Registraion> getDoc() {
		 List<Registraion> test=userservice.findDoc();

		
		return test;
	}
	
	
	
	

}