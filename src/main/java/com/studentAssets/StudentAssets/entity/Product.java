package com.studentAssets.StudentAssets.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Jpa_Product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    private  String productId;
    private String productName;

    @ManyToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<Catagory> catagory=new ArrayList<>();
}
