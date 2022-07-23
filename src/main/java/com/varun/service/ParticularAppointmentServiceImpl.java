package com.varun.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.varun.entity.AppointmentsData;
import com.varun.repository.IAppointmentDao;
import com.varun.repository.IPatientRepository;
@Service
@Transactional
public class ParticularAppointmentServiceImpl {

	@Autowired
	private IAppointmentDao iappointmentdao;
	
	
	public List<AppointmentsData> getAppointmentDetails(@PathVariable("name") String name,@PathVariable("dateofappointment") Date apptDate) {
		List<AppointmentsData> list = iappointmentdao.getAppointments(name,apptDate);
		return list;
	}

}
