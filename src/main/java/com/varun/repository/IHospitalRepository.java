package com.varun.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.varun.entity.DoctorsData;

@Repository
public class IHospitalRepository {
	
	
	@Autowired
	private EntityManager entityManager;
	
	private Session getHibernateSession()
	{
		return entityManager.unwrap(Session.class);
	}

	public List<String> getAllHospitals() {
		List<String> details = new ArrayList<>();
		try
		{
			Session session = getHibernateSession();
			String query = "SELECT distinct hospital FROM doctorsdata";
			Query<String> query2 = session.createQuery(query);			
			 details = query2.getResultList();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return details;

	}

}
