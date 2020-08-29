package com.examples;

import com.examples.entity.School;
import com.examples.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.w3c.dom.ls.LSOutput;

public class Main10 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        School school = session.find(School.class, 1);
        System.out.println(school.getName());
        school.getStudents().stream()
                .map(Student::getName)
                .forEach((System.out::println));

        transaction.commit();
        session.close();
    }
}
