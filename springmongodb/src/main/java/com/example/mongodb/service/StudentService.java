package com.example.mongodb.service;


import com.example.mongodb.entity.Student;
import com.example.mongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student createStudent (Student student) {
        return studentRepository.save(student);
    }
}
