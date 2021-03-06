package com.examples;

import com.examples.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import static com.examples.entity.Gender.MALE;

public class Main6 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee(11111, "jaj", "pass", "123", 1, 12, MALE, "ssss");
        session.persist(employee);

        transaction.commit();
        session.close();
    }
}
