package com.examples.entity;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToOne
    Client client;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public Book(String name, Client client) {
        this.name = name;
        this.client = client;
    }

    public Book(String name) {
        this.name = name;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}