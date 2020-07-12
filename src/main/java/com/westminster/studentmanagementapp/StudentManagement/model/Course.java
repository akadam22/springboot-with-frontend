package com.westminster.studentmanagementapp.StudentManagement.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data  //reduce boilerplate code fpr data objects and create getters and setters
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity     //mapped to database table
@Table(name = "Course")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Course {
    @Id
    @Column(name="Courseid_PK",nullable = false)
    private String courseid;
    @Column(name="Course_Name",nullable = false,length=50)
    private String courseName;
    @Column(name="Course_Fee",length=10)
    private int coursefee;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Courseid_PK")
    private List<Module> moduleList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> student;

}


