package com.Project.DAO;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Project.Model.RegVO;

@Repository
public class RegDAOImpl implements RegDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void insert(RegVO regVO) {
		
		try 
		{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(regVO);
		// TODO Auto-generated method stub
		}	
		catch (Exception e) 
		{
			
			e.printStackTrace();
			
			// TODO: handle exception
		}
		
	}
	
	public List search() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q =session.createQuery("from RegVO where status="+true);
		List ls=q.list();
		return ls;
	}
	@Override
	public List searchbyid(RegVO regVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q =session.createQuery("from RegVO where status=true and id="+regVO.getId());
		List ls=q.list();
		return ls;
		}


}
