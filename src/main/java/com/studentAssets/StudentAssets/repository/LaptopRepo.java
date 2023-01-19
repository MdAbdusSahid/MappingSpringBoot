package com.studentAssets.StudentAssets.repository;

import com.studentAssets.StudentAssets.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}
