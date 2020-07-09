package com.westminster.studentmanagementapp.StudentManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data  //reduce boilerplate code fpr data objects and create getters and setters
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity     //mapped to database table
@Table(catalog = "user")

public class Course {
    @Id
    @Column(name="Courseid_PK",length=50)
    private String courseid;
    @Column(name="Course_Name",nullable = false,length=50)
    private String courseName;
    @Column(name="Course_Fee",nullable = false,length=50)
    private int coursefee;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Courseid_PK")
    private List<Module> moduleList = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Student student;

}

/*
{
        "courseid" : "001CS",
        "courseName" : "Computer Science",
        "coursefee" : 12000
        }*/
