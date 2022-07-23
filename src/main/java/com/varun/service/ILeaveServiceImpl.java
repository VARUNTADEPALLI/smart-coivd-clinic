package com.varun.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.entity.Leave;
import com.varun.repository.ILeaveRepository;

@Service
@Transactional
public class ILeaveServiceImpl {
	@Autowired
	private ILeaveRepository ileaverepository;

	public Leave addLeaveDetails(Leave leave) {
		return ileaverepository.save(leave);
		
		
		
	}

}
