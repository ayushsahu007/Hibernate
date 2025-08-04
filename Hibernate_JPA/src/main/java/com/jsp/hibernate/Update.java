package com.jsp.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	EntityTransaction et = em.getTransaction();
    	
    	et.begin();
    	
        //Upadte
        //First Fetch then Update
    	
        Car c=em.find(Car.class, 101);
        //update

        c.setBrand("KIA");
        em.merge(c);
        
    	
    	et.commit();
    	em.close();
    	emf.close();
	}
}
