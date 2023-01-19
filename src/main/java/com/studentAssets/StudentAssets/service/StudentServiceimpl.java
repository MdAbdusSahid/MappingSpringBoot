package com.studentAssets.StudentAssets.service;

import com.studentAssets.StudentAssets.entity.Student;
import com.studentAssets.StudentAssets.repository.StudentRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public List<Student> getStudentById(int studentId) {
        return null;
    }

    @Override
    public void deleteStudentById(int StudentId) {

    }
}
