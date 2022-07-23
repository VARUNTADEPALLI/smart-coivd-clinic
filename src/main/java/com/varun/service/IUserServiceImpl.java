
package com.varun.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Exceptions.DoctorAlreadyExistsException;
import com.varun.Exceptions.NoUserException;
import com.varun.Exceptions.UserAlreadyExistsException;
import com.varun.entity.DoctorsData;
import com.varun.entity.Registraion;
import com.varun.repository.IUserRepository;




@Service
@Transactional
public class IUserServiceImpl {
	  @Autowired
	  private IUserRepository iuserepository;



	public String addUserDetails(Registraion info) {
		Registraion test =iuserepository.findById(info.getId()).orElse(null);
		if(test==null)
		{
			iuserepository.save(info);	
			return "User added successfully";
		}
		  else 
		  {
			  throw new UserAlreadyExistsException(
			            "User already exists!!");
		  }
		        
		
		
	}



	public String updateDocDetails(String id, Registraion info) {
		Registraion test =iuserepository.findById(id).orElse(null);
		if(test==null)
		{
			throw new NoUserException(
		            "User does not exist!!");
		}
		else
		{
			List<Registraion> list = iuserepository.findAll();
			for(Registraion inf1: list)
			{
				if(id.equals(inf1.getId()))
				{
					inf1.setPassword(info.getPassword());
					inf1.setConfirmpassword(info.getConfirmpassword());
				}
			}
			return "update succesfull";
		}
	
	}



	public Registraion findDocId(String id) {
		Registraion test =iuserepository.findById(id).orElse(null);
		if(test==null)
		{
			throw new NoUserException(
		            "User does not exist!!");
		}
		else
		{
			return test;
		}
		
		
	}



	public List<Registraion> findDoc() {
		
		List<Registraion> test =iuserepository.findAll();
		if(test.isEmpty())
		{
			throw new NoUserException(
		            "No records found!!");
		}
		else
		{
			return test;
		}
	}



	


	
}
