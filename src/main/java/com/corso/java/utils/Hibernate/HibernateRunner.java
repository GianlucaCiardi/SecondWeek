package com.corso.java.utils.Hibernate;

import com.corso.java.utils.Utils.Logger;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateRunner {


    public static void main(String[] args) {
        HibernateRunner hibernateRunner = new HibernateRunner();
    }
    public void run() {

        SessionFactory sessionFactory = null;
        Session session = null;
        Logger L = Logger.getInstance();
        //Configuration configuration = new Configuration();


        try {
        } catch (Exception e) {
            L.info(e.getMessage());
        }
        }
    }