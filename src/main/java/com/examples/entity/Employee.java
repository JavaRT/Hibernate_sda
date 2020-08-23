package com.examples.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(name = "password")
    String secret;
    @Column(length = 9, unique = true)
    String telephoneNumber;
    @Transient
    long age;
    @Temporal(TemporalType.DATE)
    int birthday;
    @Enumerated(value = EnumType.STRING)
    Gender gender;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    String description;

    public Employee(String name, String secret, String telephoneNumber, long age, int birthday, Gender gender, String description) {
        this.name = name;
        this.secret = secret;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.description = description;
    }

    public enum Gender {
        MALE

    }

}
