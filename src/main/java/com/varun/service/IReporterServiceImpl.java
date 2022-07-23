package com.varun.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Exceptions.PatientException;
import com.varun.Exceptions.ReporterException;
import com.varun.entity.AppointmentsData;
import com.varun.entity.Leave;
import com.varun.repository.IReporterDAO;


@Service
@Transactional

public class IReporterServiceImpl {
	

	@Autowired
	private IReporterDAO ireporterdao;

	public List<Leave> getDoctorDetailsById(Date apptDate) {
		List<Leave> list = ireporterdao.getDoctorDetails(apptDate);
		if(list.isEmpty())
		{
			 throw new ReporterException(
			            "No doctor records found!!");
		}
		return list;
	}



}
