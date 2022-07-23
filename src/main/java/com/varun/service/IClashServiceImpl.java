package com.varun.service;

import java.sql.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Exceptions.DoctorAlreadyExistsException;
import com.varun.Exceptions.DoctorAppointmentException;
import com.varun.entity.AppointmentsData;
import com.varun.entity.Leave;
import com.varun.repository.IClashDAO;
@Service
@Transactional
public class IClashServiceImpl {
	
	@Autowired
	private IClashDAO iclashdao;
	

	public String getDocNameById(Date dateofappointment) {
		String msg="";
		String docname = iclashdao.getDocNameById(dateofappointment);
		try
		{
			if(docname!=null)
			{
				throw new DoctorAppointmentException(
			            "Doctor on leave!!");
			}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			throw new DoctorAppointmentException(
		            "Doctor Available!!");
		}
	
		return docname;
	}

}
