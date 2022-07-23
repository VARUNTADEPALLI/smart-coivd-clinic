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
import com.varun.entity.Leave;

@Repository
public class IReporterDAOImpl implements IReporterDAO{

	
	@Autowired
	private EntityManager entityManager;
	
	private Session getHibernateSession()
	{
		return entityManager.unwrap(Session.class);
	}

	@Override
	public List<Leave> getDoctorDetails(Date apptDate) {
		List<Leave> list = new ArrayList<>();
		Leave le;
		try
		{
			
			Session session = getHibernateSession();
			String query = "select d.id from doctorsdata d,leavemanagement l where '"+ apptDate +"' not between l.dateofleave and l.lastleavedate";
			
			Query<Leave> query2 = session.createQuery(query);	
			
			list = query2.getResultList();
			
//			if(list.isEmpty()) {
//				list.add(le.getId());
//			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
	

}
