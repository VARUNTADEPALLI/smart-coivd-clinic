package com.varun.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Exceptions.AppointmentException;
import com.varun.Exceptions.DoctorAlreadyExistsException;
import com.varun.entity.AppointmentsData;
import com.varun.entity.DoctorsData;
import com.varun.entity.PatientData;
import com.varun.repository.AppointmentRepository;
import com.varun.repository.IDoctorRepository;

@Service
@Transactional
public class AppointmentServiceImpl {
	
	  @Autowired
	  private AppointmentRepository appointmentRepository;

//	public List<AppointmentsData> getAppointmentDetailsById(Date apptDate) {
//		
//		List<AppointmentsData> docinfo=appointmentRepository.findByDateofappointment(apptDate);
//		if(docinfo.isEmpty())
//		{
//			throw new AppointmentException(
//		            "Appointment does not  exist!!");
//		}
//		
//		  return docinfo;
//
//	}

	public AppointmentsData addAppointmentDetails(AppointmentsData info) {
		AppointmentsData existingAppointment = appointmentRepository.findById(info.getId()).orElse(null);
		if(existingAppointment==null)
		{
			 
			return appointmentRepository.save(info);
		}
		else
		{
			 throw new AppointmentException(
			            "Appointment already exists!!");

		}
		
		
		
		
	}

	public String deleteAppointmentDetailsById(String id) {
		Optional<AppointmentsData> docinfo=appointmentRepository.findById(id);
		String a="";
		if(docinfo==null)
		{
			throw new AppointmentException(
		            "Appointment does not  exist!!");
		}
		else
		{
			appointmentRepository.deleteById(id);
			a="Succesfully deleted";
		}
		return a;
	}

	public String updateAppointmentDetailsById(String id,AppointmentsData info) {
		List<AppointmentsData> list = appointmentRepository.findAll();
		String a="";
		if(list.isEmpty())
		{
			throw new AppointmentException(
		            "Appointment does not  exist!!");
		}
		else
		{
			
			for(AppointmentsData inf1: list)
			{
				if(id.equals(inf1.getId()))
				{
					inf1.setName(info.getName());
					inf1.setAge(info.getAge());
					inf1.setPatientname(info.getPatientname());
					inf1.setEducation(info.getEducation());
					inf1.setHospital(info.getHospital());
					inf1.setSpecialization(info.getSpecialization());
					inf1.setDateofappointment(info.getDateofappointment());
					
					
				}
			}
			a="Successfully updated";
		}
		return a;
	}

	public Optional<AppointmentsData> getAppointmentById(String id) {
		Optional<AppointmentsData> docinfo=appointmentRepository.findById(id);
		if(docinfo==null)
		{
			throw new AppointmentException(
		            "Appointment does not  exist!!");
		}
		
		  return docinfo;
	}
		
		
	}


