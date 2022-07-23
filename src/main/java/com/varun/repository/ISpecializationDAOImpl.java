package com.varun.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.varun.entity.AppointmentsData;
import com.varun.entity.DoctorsData;


@Repository
public class ISpecializationDAOImpl implements ISpecializationDAO{
	
	

	@Autowired
	private EntityManager entityManager;
	
	private Session getHibernateSession()
	{
		return entityManager.unwrap(Session.class);
	}


	@Override
	public List<String> getgetSpecializations(String hospitals) {
		List<String> list = new ArrayList<>();
		try
		{
			
			Session session = getHibernateSession();
			String query = "Select specialization from doctorsdata where hospital = '"+hospitals+"'";
			
			Query<String> query2 = session.createQuery(query);	
			
			list = query2.getResultList();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public List<DoctorsData> getDocs(String hospitals,String specializations) {
		List<DoctorsData> list = new ArrayList<>();
		try
		{
			
			Session session = getHibernateSession();
			String query = "Select d from doctorsdata d where hospital = '"+hospitals+"' and specialization = '"+specializations+"'";
			
			Query<DoctorsData> query2 = session.createQuery(query);	
			
			list = query2.getResultList();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	

}
