package com.dev.scalerbackend.Inheritance.JoinedTable.Services;

import com.dev.scalerbackend.Inheritance.JoinedTable.Models.Student;
import com.dev.scalerbackend.Inheritance.JoinedTable.Repositories.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("jt_studentService")
public class StudentService {

    StudentRepo studentRepo;

    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
}
