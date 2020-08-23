package com.examples;

import com.examples.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import static com.examples.entity.Employee.Gender.MALE;

public class Main6 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee("jaj", "pass", "123", 1, 12, MALE, "ssss");
        session.persist(employee);

        transaction.commit();
        session.close();
    }
}
