package com.example;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



public class InsertDAO {

	
	public int insert(product e) {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int r=(Integer) s.save(e);
		t.commit();
		return r;
	}
	
	
	public List<product> get() {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("from product");
		List<product> el =q.list();
		t.commit();
		return el;
	}
}
