package com.examples;

import com.examples.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(new Dog("ares", "terier", 12));
        session.persist(new Dog("ares2", "terier2", 13));
        session.persist(new Dog("ares3", "terier3", 14));
        session.persist(new Dog("ares4", "terier4", 15));
        session.persist(new Dog("ares5", "terier5", 16));


        transaction.commit();
        session.close();
    }
}
