package com.westminster.studentmanagementapp.StudentManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data  //reduce boilerplate code for data objects and create getters and setters
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity     //mapped to database table
@Table(name = "Module1")
public class Module {
    @Id
    @Column(name="Moduleid_PK",length=50)
    private String moduleid;

    @Column(name="Module_Name",nullable = false,length=50)
    private String moduleName;

    /*@ManyToOne
    @JoinColumn(referencedColumnName = "Courseid_PK")
    private Course course;*/

}


/*
{
        "name" : "Anushka",
        "course" :
        {
        "courseId" : "001IT",
        "courseName" : "Information Technology",
        "fee" : 12000,
        "moduleList" :
        [
        {
        "moduleId" : "001Programming Principles",
        "moduleName" : "Programming"
        },
        {
        "moduleId" : "002CS",
        "moduleName" : "Computer Science"
        }
        ]
        }
        }*/

/*

{
        "studentFirstName" : "Anushka",
        "studentLastName" : "Kadam",
        "email" : "anuk@gmail.com",
        "course" :
        {
        "courseName" : "Information Technology",
        "fee" : 12000,
        "moduleList" :
        [
        {
        "moduleId" : "001Programming Principles",
        "moduleName" : "Programming"
        },
        {
        "moduleId" : "002CS",
        "moduleName" : "Computer Science"
        }
        ]
        }
        }*/
