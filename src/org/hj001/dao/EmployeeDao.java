package org.hj001.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao extends HibernateDaoSupport{
	@Resource
	public void sets(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	
	public List<?> select(String hql){
		HibernateTemplate jdbc = getHibernateTemplate();
		List<?> list = jdbc.find(hql);
		return list;
	}
	
}
