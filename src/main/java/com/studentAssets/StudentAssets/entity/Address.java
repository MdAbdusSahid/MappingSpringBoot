package com.studentAssets.StudentAssets.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Jpa_Address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    private  int addressId;
    private  String street;
    private String city;
    private String country;

    @ManyToOne
    @JoinColumn(name = "Student_Id")
    private  Student student;

}
