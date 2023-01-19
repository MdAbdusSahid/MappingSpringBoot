package com.studentAssets;

import com.studentAssets.StudentAssets.entity.*;
import com.studentAssets.StudentAssets.repository.CatagoryRepo;
import com.studentAssets.StudentAssets.repository.ProductRepo;
import com.studentAssets.StudentAssets.repository.StudentRepo;
import com.studentAssets.StudentAssets.service.StudentService;
import com.studentAssets.StudentAssets.service.StudentServiceimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudentAssetsApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(StudentAssetsApplication.class);
	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentAssetsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student();
//		student.setStudentName("Agarwal");
//		student.setAbout("I am a software Enginner");
//		student.setStudentId(16);
//
//		Laptop laptop=new Laptop();
//		laptop.setBrand("HP");
//		laptop.setModel("AU006TX");
//		laptop.setLaptopId(45637);
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//
//		Student save=studentRepo.save(student);
//	Student student=studentRepo.findById(7).get();
//
//
//	logger.info("Name is {} Id is {}",student.getStudentName(),student.getStudentId());
//	System.out.println("Name is  "+student.getStudentName());
//	Laptop laptop=student.getLaptop();
//	logger.info("Laptop {} {}",laptop.getBrand(),laptop.getModel());
//	System.out.println("laptop "+laptop.getBrand()+laptop.getModel());



		//ManyToOne

//		Student student = new Student();
//		student.setStudentName("Gill");
//		student.setAbout("I am a software Enginner");
//		student.setStudentId(45);
//
//		Address a1=new Address();
//		a1.setAddressId(1);
//		a1.setCity("Lalgola");
//		a1.setStreet("38/300");
//		a1.setCountry("Ind");
//		a1.setStudent(student);
//
//		Address a2=new Address();
//		a2.setAddressId(2);
//		a2.setCity("Kolkata");
//		a2.setStreet("38/300");
//		a2.setCountry("India");
//		a2.setStudent(student);
//
//		List<Address> address=new ArrayList<>();
//		address.add(a1);
//		address.add(a2);
//
//		student.setAddresses(address);
//		Student save= studentRepo.save(student);


		Product product1=new Product();
		product1.setProductId("pid1");
		product1.setProductName("Samsung S23");

		Product product2 = new Product();
		product2.setProductId("pid2");
		product2.setProductName("Iphone 14");

		Product product3 = new Product();
		product3.setProductId("pid3");
		product3.setProductName("Sony Tv");

		Catagory catagory1=new Catagory();
		catagory1.setCatagoryId("cid1");
		catagory1.setTitel("Eclectronics");

		Catagory catagory2=new Catagory();
		catagory2.setCatagoryId("cid2");
		catagory2.setTitel("Mobile Phone");

		List<Product> catagory1product=catagory1.getProduct();
		catagory1product.add(product1);
		catagory1product.add(product2);
		catagory1product.add(product3);

		List<Product>catagory2productList=catagory2.getProduct();
		catagory2productList.add(product3);

		List<Catagory>product1catagory=product1.getCatagory();
		product1catagory.add(catagory1);

		List<Catagory>product2catagory=product2.getCatagory();
		product2catagory.add(catagory2);


		catagoryRepo.save(catagory1);
		catagoryRepo.save(catagory2);

	}

	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private CatagoryRepo catagoryRepo;
}
