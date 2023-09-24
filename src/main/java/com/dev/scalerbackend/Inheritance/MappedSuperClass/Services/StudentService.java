package com.dev.scalerbackend.Inheritance.MappedSuperClass.Services;

import com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories.StudentRepo;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("ms_studentService")
public class StudentService {

    StudentRepo studentRepo;

    private List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    private Student saveStudent(Student student){
        return studentRepo.save(student);
    }
}
