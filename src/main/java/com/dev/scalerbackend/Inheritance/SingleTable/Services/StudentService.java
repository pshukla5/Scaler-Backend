package com.dev.scalerbackend.Inheritance.SingleTable.Services;

import com.dev.scalerbackend.Inheritance.SingleTable.Models.Student;
import com.dev.scalerbackend.Inheritance.SingleTable.Repositories.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("st_studentService")
public class StudentService {

    StudentRepo studentRepo;

    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
}
