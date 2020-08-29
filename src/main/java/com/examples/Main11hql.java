package com.examples;

import com.examples.entity.Husband;
import com.examples.entity.School;
import com.examples.entity.Student;
import com.examples.entity.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;
import java.util.Objects;

public class Main11hql {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query queryOne = session.createQuery("FROM Husband");
        List<Husband> resultsOne = queryOne.getResultList();
        resultsOne.stream().map(Husband::getName).forEach(System.out::println);

        Query queryTwo = session.createQuery("SELECT h.name FROM Husband AS h");
        List<String> resultsTwo = queryTwo.getResultList();
        resultsTwo.forEach(System.out::println);


        transaction.commit();
        session.close();
    }
}