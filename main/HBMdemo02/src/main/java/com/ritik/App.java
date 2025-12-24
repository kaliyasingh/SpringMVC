package com.ritik;


import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;


public class App {

	public static void main(String[] args) {
   
		System.out.println("application started");
	    Scanner sc = new Scanner(System.in);

		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		int n=1;
		while(n==1) {
		System.out.println("What Do U Want : ");
		System.out.println("Add Employee : 1");
		System.out.println("Update Employee : 2");
		System.out.println("Delete Employee : 3");
		System.out.println("Search Employee : 4");
		System.out.println("List Of All Employee : 5");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		    
		Employee e = new Employee();
		Session session = null;
		Transaction tx= null;

	  switch (choice) {
		  case 1:
			System.out.println("Enter employee name");
			e.setEmpname(sc.next());
			System.out.println("Enter employe sallary");
			e.setSalary(sc.nextDouble());
			
			session= sf.openSession();
			tx=session.beginTransaction();
			session.save(e);
			tx.commit();
			System.out.println("student added scussefully");

			break;
          
		  case 2:
			    System.out.print("Enter employee id :");
			    e.setEmpid(sc.nextInt());
				System.out.print("Enter employee name :");
				e.setEmpname(sc.next());
				System.out.print("Enter employe sallary :");
				e.setSalary(sc.nextDouble());
				
				session= sf.openSession();
				tx=session.beginTransaction();
				session.update(e);;
				tx.commit();
				System.out.println("student updated scussefully");

				break;
		
		  case 3:
			    System.out.print("Enter employee id :");
			    e.setEmpid(sc.nextInt());
			    
			    session= sf.openSession();
				tx=session.beginTransaction();
				session.delete(e);;
				tx.commit();
				System.out.println("student deleted scussefully");
				break;
			
		  case 4:
     			System.out.println("*****To Search Employee****");
			    System.out.print("Enter employee id :");
			    e.setEmpid(sc.nextInt());
			    
			    session= sf.openSession();
				tx=session.beginTransaction();
				try{
					//e = session.load(Employee.class,e.getEmpid());
					e=session.get(Employee.class,e.getEmpid());
					System.out.println(e);
				}
				catch (Exception e2) {
					System.out.println("empty result");
				}
				tx.commit();
				break;
				
		  case 5:
			  System.out.println("*******List of All Employee");
			  session = sf.openSession();
			  tx = session.beginTransaction();
			  
	          Query<Employee> q1 = session.createQuery("from Employee");
			  List<Employee> lst = q1.getResultList();
			  for (Employee employee : lst) {
				System.out.println(employee);
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);

		}
	    System.out.println("Do you want to continue press Y=1/n=0");
		n= sc.nextInt();
		}
		sf.close();
		sc.close();
	}

}
