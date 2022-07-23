package com.varun.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.varun.entity.AppointmentsData;


@Repository
public class IAppointmentDAOImpl implements IAppointmentDao{
	

	@Autowired
	private EntityManager entityManager;
	
	private Session getHibernateSession()
	{
		return entityManager.unwrap(Session.class);
	}

	@Override
	public List<AppointmentsData> getAppointments(String name, Date apptDatename) {
		List<AppointmentsData> list = new ArrayList<>();
		try
		{
			
			Session session = getHibernateSession();
			String query = "Select a from patientappointmentdata a where name = '"+name+"'"+" and dateofappointment = '"+apptDatename+"'";
			
			Query<AppointmentsData> query2 = session.createQuery(query);	
			
			list = query2.getResultList();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
	

}
