package com.studentAssets.StudentAssets.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Jpa_Catagory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Catagory {
    @Id
    private String catagoryId;
    private  String titel;

    @ManyToMany
    private List<Product> product=new ArrayList<>();
}
