package com.westminster.studentmanagementapp.StudentManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data  //reduce boilerplate code fpr data objects and create getters and setters
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity     //mapped to database table
@Table(name = "Student1")
public class Student {
    //declaring instance variables

    @Id //this notifies the JPA the primary key for the database table

    @Column(name="Studentid_PK")
    private String id;

    @Column(name="First_Name",length=50,nullable = false)
    private String studentFirstName;

    @Column(name="Last_Name",length=50,nullable = false)
    private String studentLastName;

    @Column(name="Email",length=50,nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Studentid_PK")
    private Course course;

}
/*
{
        "studentFirstName" : "Veena",
        "studentLastName" : "Kadam",
        "email" : "vk@gmail.com"
        }*/

/*
{
        "id" : "w157938",
        "studentFirstName" : "Anushka",
        "studentLastName" : "Kadam",
        "email" : "ak@gmail.com",
        "course" :
        {
        "courseid" : "001214121",
        "courseName" : "Computer",
        "fee" : 11000,
        "moduleList" :
        [
        {
        "moduleid" : "001PP",
        "moduleName" : "Programming"
        },
        {
        "moduleid" : "0043IT",
        "moduleName" : "Info"
        }
        ]
        }
        }*/
