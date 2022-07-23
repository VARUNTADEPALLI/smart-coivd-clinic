package com.varun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.entity.Leave;
import com.varun.repository.ILeaveRepository;
import com.varun.service.ILeaveServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/leave")
public class LeaveManagemanetController {
	@Autowired
	private ILeaveServiceImpl leaveservice;
	
	
	@PostMapping
	public Leave saveLeaveDetails(@RequestBody Leave leave)
	{
		
		leaveservice.addLeaveDetails(leave);
		return leave;
	}

}
