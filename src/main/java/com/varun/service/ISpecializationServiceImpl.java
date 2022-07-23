package com.varun.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Exceptions.HospitalsException;
import com.varun.Exceptions.UserAlreadyExistsException;
import com.varun.entity.DoctorsData;
import com.varun.repository.ISpecializationDAO;
@Service
@Transactional
public class ISpecializationServiceImpl {

	@Autowired
	private ISpecializationDAO ispecializationdao;
	
	public List<String> getSpecializationById(String hospitals) {
		List<String> list = ispecializationdao.getgetSpecializations(hospitals);
		if(list.isEmpty())
		{
			 throw new HospitalsException(
			            "Hospitals do not exist!!");
		}
		return list;
	}

	public List<DoctorsData> getDoctorsById(String hospitals,String specializations) {
		
		List<DoctorsData> list = ispecializationdao.getDocs(hospitals,specializations);
		if(list.isEmpty())
		{
			 throw new HospitalsException(
			            "Hospitals do not exist!!");
		}
		return list;
	}

}
