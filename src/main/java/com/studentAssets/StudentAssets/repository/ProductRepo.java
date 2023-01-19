package com.studentAssets.StudentAssets.repository;

import com.studentAssets.StudentAssets.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
