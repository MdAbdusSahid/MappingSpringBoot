package com.studentAssets.StudentAssets.service;

import com.studentAssets.StudentAssets.entity.Laptop;
import com.studentAssets.StudentAssets.entity.Student;
import com.studentAssets.StudentAssets.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LaptopServiceImpl implements LaptopService{

    @Autowired
    private LaptopRepo rlaptoprepo;


    @Override
    public Laptop saveLaptop(Laptop laptop) {
        return null;
    }

    @Override
    public List<Laptop> getAllLaptops(Laptop laptop) {
        return null;
    }

    @Override
    public List<Laptop> getLaptopById(int laptopId) {
        return null;
    }

    @Override
    public void deleteteLaptopById(int laptopId) {

    }
}
