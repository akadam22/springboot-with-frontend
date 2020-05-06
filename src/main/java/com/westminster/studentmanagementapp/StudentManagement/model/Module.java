package com.westminster.studentmanagementapp.StudentManagement.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/*
   This is the entity class
   It tells the JPA to create table with the instance variables in the class
*/
@Data
@NoArgsConstructor
@ToString
@Entity
public class Module {

    //declaring instance variables
    //@GeneratedValue
    @Id //this notifies the JPA the primary key for the database table
    private String mid;
    private String subName;
    private String info;

    @ManyToOne
    private Student student;

}
