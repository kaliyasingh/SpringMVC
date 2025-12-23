package com.ritik;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;


public class App {
    
	public static void main(String[] args)
	{
		System.out.println("\t*************Application started from here****");
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx  = session.beginTransaction();
    	
    	Student st = new Student();
    	st.setId(101);
        st.setName("ritik");
        st.setCity("indore");
        
        try {
        	session.save(st);
        	tx.commit();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    	System.out.println("\t ******** table created succesfully");
        sf.close();
        session.close();
		
	}
}
