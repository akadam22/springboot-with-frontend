package com.westminster.studentmanagementapp.StudentManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {

    //declaring instance variables
    @Id //this notifies the JPA the primary key for the database table

    private String id;
    private String studentFirstName;
    private String studentLastName;



}
