package com.examples;

import com.examples.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Dog dog = new Dog ("azor", "husky", 10);
        System.out.println(dog.getId());
        session.persist(dog);
        System.out.println(dog.getId());

        dog.setAge(12);
        session.evict(dog);
        dog.setRace("asasas");

        transaction.commit();
        session.close();


    }
}
