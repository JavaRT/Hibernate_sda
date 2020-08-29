package com.examples;

import com.examples.entity.School;
import com.examples.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main9 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        School schoolOne = new School("PG");
        School schoolTwo = new School("UG");

        Student studentOne = new Student("Jan");
        Student studentTwo = new Student("Ola");
        Student studentThree = new Student("Adam");

        schoolOne.addStudent(studentOne);
        schoolOne.addStudent(studentTwo);

        schoolTwo.addStudent(studentTwo);
        schoolTwo.addStudent(studentThree);

        session.persist(schoolOne);
        session.persist(schoolTwo);

        transaction.commit();
        session.close();
    }
}