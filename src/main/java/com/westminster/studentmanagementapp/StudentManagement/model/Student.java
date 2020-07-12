package com.westminster.studentmanagementapp.StudentManagement.model;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@Table(name = "Student")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
    //declaring instance variables

    @Id //this notifies the JPA the primary key for the database table

    @Column(name="Studentid_PK",nullable = false)
    private String id;

    @Column(name="First_Name",length=50,nullable = false)
    private String studentFirstName;

    @Column(name="Last_Name",length=50,nullable = false)
    private String studentLastName;

    @Column(name="Email",length=50,nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Course course;

}
