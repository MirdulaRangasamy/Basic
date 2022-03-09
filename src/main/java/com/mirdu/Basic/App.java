package com.mirdu.Basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mirdu.inhertance.ActiveEmployee;
import com.mirdu.inhertance.RetiredEmployee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stud_pu");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();	
       
        Student1 st1 = new Student1(101,"Vicky");
        Student1 st2 = new Student1(102,"Veena");
        Student1 st3 = new Student1(103,"Preethi");
        Student1 st4 = new Student1(104,"Manu");
             
        Book b1 = new Book(201,"DS");
        Book b2 = new Book(202,"OOPS");
        Book b3 = new Book(203,"AI");
        Book b4 = new Book(204,"HTML");
        Book b5 = new Book(205,"JS");
        Book b6 = new Book(206,"CSS");
        Book b7 = new Book(207,"JS1");
        Book b8 = new Book(208,"CSS1");
                
        st1.getSbook().add(b1);
        st1.getSbook().add(b2);
        
        st2.getSbook().add(b3);
        st2.getSbook().add(b4);
        
        st3.getSbook().add(b5);
        st3.getSbook().add(b6);
        
        st4.getSbook().add(b7);
        st4.getSbook().add(b8);
        
        
        b1.getStud().add(st1);
        b1.getStud().add(st2);
        
        b2.getStud().add(st3);
        b2.getStud().add(st4);
        
        b3.getStud().add(st1);
        b3.getStud().add(st4);
        
        b4.getStud().add(st2);
        b4.getStud().add(st3);
        
                        
        em.persist(st1);
        em.persist(st2);
        em.persist(st3);
        em.persist(st4);
        
		/*
		 * em.persist(b1); em.persist(b2); em.persist(b3); em.persist(b4);
		 * em.persist(b5); em.persist(b6);
		 */
        
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
