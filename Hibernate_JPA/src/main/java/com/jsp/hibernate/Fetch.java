package com.jsp.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch{
	public static void main(String[] args) {
		
		
 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	EntityTransaction et = em.getTransaction();
    	
    	et.begin();
    	
    	
    	   Car c =    em.find(Car.class, 101);
    	   System.out.println(c);
    	   
    		et.commit();
        	em.close();
        	emf.close();
	}

}
