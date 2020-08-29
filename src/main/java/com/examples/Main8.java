package com.examples;


import com.examples.HibernateUtils;
import com.examples.entity.Book;
import com.examples.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main8 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Client clientOne = new Client("aaa");
        clientOne.addBook((new Book("qwerty")));
        clientOne.addBook((new Book("qwerty2")));
        clientOne.addBook((new Book("qwerty3")));

        Client clientTwo = new Client("BBB");
        clientTwo.addBook((new Book("1qwerty")));
        clientTwo.addBook((new Book("2qwerty")));
        clientTwo.addBook((new Book("3qwerty")));

session.persist(clientOne);
session.persist(clientTwo);

        transaction.commit();
        session.close();
    }
}