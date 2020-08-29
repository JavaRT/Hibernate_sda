package com.examples.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_school",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "school_id")
    )
    Set<School> schools = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    public Set<School> getSchools() {
        return schools;
    }

    public void setSchools(Set<School> schools) {
        this.schools = schools;
    }

    public Student(String name, Set<School> schools) {
        this.name = name;
        this.schools = schools;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void addSchool(School school) {
        schools.add(school);
    }

    public String getName() {
        return name;
    }
}