package com.studentAssets.StudentAssets.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> addresses=new ArrayList<>();



}
