package com.varun.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Exceptions.DoctorAlreadyExistsException;
import com.varun.Exceptions.PatientException;
import com.varun.entity.DoctorsData;
import com.varun.entity.PatientData;
import com.varun.entity.Registraion;
import com.varun.repository.IPatientRepository;
@Service
@Transactional
public class IPatientServiceImpl {
	@Autowired
	private IPatientRepository ipatientepository;

	public String addPatientDetails(PatientData info) 
	{
		PatientData existingPatient = ipatientepository.findById(info.getId()).orElse(null);
	    if (existingPatient == null) 
	    {
	    	ipatientepository.save(info);
	        return "Patient added successfully";
	    }
	    else
	        throw new PatientException(
	            "Patient already exists!!");
	}
		
	

	public void removePatientDetails(String id) {
		PatientData existingPatient = ipatientepository.findById(id).orElse(null);
		if(existingPatient == null)
		{
			 throw new PatientException(
			            "Patient does not exist!!");
		}
		else
		{
			ipatientepository.deleteById(id);
		}
		
		
	}

	public String updatePatientDetails(String id, PatientData info) {
		PatientData test =ipatientepository.findById(id).orElse(null);
		if(test==null)
		{
			 throw new PatientException(
			            "Patient does not exist!!");
		}
		else
		{
			List<PatientData> list = ipatientepository.findAll();
			for(PatientData inf1: list)
			{
				if(id.equals(inf1.getId()))
				{
					inf1.setName(info.getName());
					inf1.setAge(info.getAge());
					inf1.setMobile(info.getMobile());
					inf1.setEmail(info.getEmail());
					inf1.setIllness(info.getIllness());
					inf1.setIllnessduration(info.getIllnessduration());
					inf1.setMedicalhistory(info.getMedicalhistory());
					inf1.setMedicinesinuse(info.getMedicinesinuse());
					
				}
			}
			return "update succesfull";
		}
		
	}

	public PatientData getPatientDetailsById(String id) {

		PatientData patinfo=ipatientepository.findById(id).orElse(null);
		if(patinfo==null)
		{
			 throw new PatientException(
			            "Patient does not exist!!");
		}
		else
		{
			return patinfo;
		}
		  
		
	}

}
