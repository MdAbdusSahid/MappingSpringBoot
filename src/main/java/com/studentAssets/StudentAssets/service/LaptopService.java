package com.studentAssets.StudentAssets.service;

import com.studentAssets.StudentAssets.entity.Laptop;

import java.util.List;

public interface LaptopService {
    Laptop saveLaptop(Laptop laptop);
    List<Laptop> getAllLaptops(Laptop laptop);
    List<Laptop> getLaptopById(int laptopId);
    void deleteteLaptopById(int laptopId);

}
