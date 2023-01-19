package com.studentAssets.StudentAssets.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "jap_Laptop")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Laptop {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int laptopId;
    private String model;
    private String brand;

    @OneToOne
    @JoinColumn(name = "Student_Id")
    private Student student;
}
