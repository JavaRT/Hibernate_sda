package com.examples;

import com.examples.entity.Employee;
import com.examples.entity.Husband;
import com.examples.entity.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main7 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Husband husband = session.find(Husband.class, 5l);
        husband.setWife(null);

//        session.persist(new Husband("damian", new Wife("ula")));
//        session.persist(new Husband("ared", new Wife("zebia")));
//        session.persist(new Husband("gena", new Wife("alina")));
//        session.persist(new Husband("unit", new Wife("tina")));


//        Husband husband = new Husband("Bartek");
//        Wife wife = new Wife("natalia");
//        husband.setWife(wife);
//        session.persist(husband);

        transaction.commit();
        session.close();
    }
}