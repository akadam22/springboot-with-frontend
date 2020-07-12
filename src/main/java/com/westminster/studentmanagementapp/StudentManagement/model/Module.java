package com.westminster.studentmanagementapp.StudentManagement.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data  //reduce boilerplate code for data objects and create getters and setters
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity     //mapped to database table
@Table(name = "Module")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Module {
    @Id
    @Column(name="Moduleid_PK",length=50,nullable = false)
    private String moduleid;

    @Column(name="Module_Name",nullable = false,length=50)
    private String moduleName;

    @OneToMany
    private List<Course> course = new ArrayList<>();


}
