package com.varun.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Exceptions.DoctorAlreadyExistsException;
import com.varun.Exceptions.DoctorDoesNotExistException;
import com.varun.entity.AppointmentsData;
import com.varun.entity.DoctorsData;
import com.varun.repository.AppointmentRepository;
import com.varun.repository.IDoctorRepository;
import com.varun.repository.IHospitalRepository;




@Service
@Transactional
public class IDoctorServiceImpl {
	  @Autowired
	  private IDoctorRepository idoctorRepository;
	  
	  @Autowired
	  private IHospitalRepository ihospitalRepository;
	

	public String addDocDetails(DoctorsData info) {
		DoctorsData existingDoctor = idoctorRepository.findById(info.getId()).orElse(null);
    if (existingDoctor == null) {
    	idoctorRepository.save(info);
        return "Doctor added successfully";
    }
    else
        throw new DoctorAlreadyExistsException(
            "Doctor already exists!!");
	}

	public String removeDocDetails(String id) {
		DoctorsData existingDoctor= idoctorRepository.findById(id).orElse(null);
		if (existingDoctor == null) 
	    {
	    	throw new DoctorDoesNotExistException("Doctor does not exist!!");
	    }
		else
		{
			idoctorRepository.deleteById(id);
			return "delete successful";
			
		}
		
	}

	public DoctorsData getDocDetailsById(String id)
	{
	
		DoctorsData existingDoctor= idoctorRepository.findById(id).orElse(null);
		if (existingDoctor == null) 
	    {
	    	throw new DoctorDoesNotExistException("Doctor does not exist!!");
	    }
		else
		{
			return existingDoctor;
		}
		
		  
	}

	public List<DoctorsData> getAllDocs() {
		List<DoctorsData> list =idoctorRepository.findAll();
		return list;
	}

	public String updateDocDetails(String id, DoctorsData info) {
		DoctorsData existingDoctor= idoctorRepository.findById(id).orElse(null);
	    if (existingDoctor == null) 
	    {
	    	throw new DoctorDoesNotExistException("Doctor does not exist!!");
	    }
	    else
	    {
	    	List<DoctorsData> list = idoctorRepository.findAll();
			for(DoctorsData inf1: list)
			{
				if(id.equals(inf1.getId()))
				{
					inf1.setName(info.getName());
					inf1.setAge(info.getAge());
					inf1.setHospital(info.getHospital());
					inf1.setEducation(info.getEducation());
					inf1.setSpecialization(info.getSpecialization());
					
				}
			}
			return "update succesfull";
	    }
		
		
	}

	public List<String> getHospitalDetailsById() {
		List<String> list =ihospitalRepository.getAllHospitals();
		if(list.isEmpty())
		{
			throw new DoctorAlreadyExistsException("No hospital exists!!");
		}
		return list;
	}

	

	

}
