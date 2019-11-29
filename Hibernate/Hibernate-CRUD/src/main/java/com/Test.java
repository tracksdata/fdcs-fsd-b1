package com;


import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;
import com.cts.product.entity.Student;

public class Test {

	public static void main(String[] args){

		Session ses1 = DBConfig.getSessionbFactory().openSession();
		Session ses2 = DBConfig.getSessionbFactory().openSession();
		Session ses3 = DBConfig.getSessionbFactory().openSession();

		
		Student s1=new Student();
		s1.setStudentId("S008");
		s1.setStudentName("Abc");
		s1.setMarks(23);
		
		Student s2=new Student();
		s2.setStudentId("S009");
		s2.setStudentName("Xyz");
		s2.setMarks(645);
		
		Student s3=new Student();
		s3.setStudentId("S005");
		s3.setStudentName("ruth");
		s3.setMarks(533);
		
		ses1.save(s1);
		ses1.save(s2);
		ses1.save(s3);

		
		ses1.beginTransaction().commit();
		//ses2.beginTransaction().commit();
		//ses3.beginTransaction().commit();
		
		
		System.out.println("--- Done");

	}

}