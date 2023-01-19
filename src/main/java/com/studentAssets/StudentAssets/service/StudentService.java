package com.studentAssets.StudentAssets.service;

import com.studentAssets.StudentAssets.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudent();
    List<Student> getStudentById(int studentId);
    void deleteStudentById(int studentId);
}
