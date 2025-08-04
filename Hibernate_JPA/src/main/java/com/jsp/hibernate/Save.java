package com.jsp.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Save
{
    public static void main( String[] args )
    {
    	
    	Car car = new Car();
    	car.setCarId(101);
    	car.setModel("sdv2");
    	car.setBrand("BMW");
    	car.setPrice(1234500);
    	
    	Car car1 = new Car();
    	car1.setCarId(102);
    	car1.setModel("Trx5");
    	car1.setBrand("Audi");
    	car1.setPrice(1200345);  
    	
    	Car car2 = new Car();
    	car2.setCarId(103);
    	car2.setModel("Curve");
    	car2.setBrand("Tata");
    	car2.setPrice(12005);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	EntityTransaction et = em.getTransaction();
    	
    	et.begin();
    	
    	em.persist(car);
    	em.persist(car1);
    	em.persist(car2);
    	
    	
    	
    	
    	et.commit();
    	em.close();
    	emf.close();
    }
}
