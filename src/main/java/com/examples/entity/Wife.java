package com.examples.entity;

import javax.persistence.*;

@Entity
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne(mappedBy = "wife")
    Husband husband;

    public Husband getHusband() {

        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
        this.husband.setWife(this);
    }

    public Wife() {
    }

    public Wife(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

