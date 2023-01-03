package com.mca;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.lang.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;
import javax.xml.*;
import org.hibernate.cfg.*;
public class DepartmentDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		try {
			
			Department obj=new Department();
			
			//Inserting 10 records
			obj.setDeptid(1);
			obj.setDeptname("cse");
			obj.setMarks(12);
			obj.setDeptid(2);
			obj.setDeptname("cse");
			obj.setMarks(13);
			obj.setDeptid(3);
			obj.setDeptname("cse");
			obj.setMarks(14);
			obj.setDeptid(4);
			obj.setDeptname("cse");
			obj.setMarks(15);
			obj.setDeptid(5);
			obj.setDeptname("cse");
			obj.setMarks(16);
			obj.setDeptid(6);
			obj.setDeptname("cse");
			obj.setMarks(17);
			obj.setDeptid(7);
			obj.setDeptname("cse");
			obj.setMarks(18);
			obj.setDeptid(8);
			obj.setDeptname("cse");
			obj.setMarks(19);
			obj.setDeptid(9);
			obj.setDeptname("cse");
			obj.setMarks(20);
			obj.setDeptid(10);
			obj.setDeptname("cse");
			obj.setMarks(21);			
			session.save(obj);
			t.commit();
			System.out.println("Operation is successful!!");
			session.close();

			
		}catch(Exception e) {
			System.out.println("The exception is : "+e);
		}

	}


}


