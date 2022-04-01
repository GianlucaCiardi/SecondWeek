package com.corso.java.utils.Dominio;

import com.corso.java.utils.Utils.JPAutils;
import org.apache.log4j.PropertyConfigurator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class JPATest {

    private static final String log4jProperties = "";
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction et;
    private Query query;

    public  void init(){
        PropertyConfigurator.configure(log4jProperties);
        emf = JPAutils.getEntityManagerFactory();
        em = emf.createEntityManager();
    }

    public void createTransaction(){
        init();
        et = em.getTransaction();
        et.begin();

        Family family;
        Person person;

        // Read the existing entries
        query = em.createQuery("select * from Person m");
        // Persons should be empty
    }


    public  void print(){
        int numberRows = query.getResultList().size();
    }

    public static void main(String[] args) {
        JPATest jpaTest = new JPATest();
        jpaTest.createTransaction();;
    }

}
