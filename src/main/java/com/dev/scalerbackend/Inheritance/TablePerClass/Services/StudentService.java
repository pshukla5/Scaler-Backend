package com.dev.scalerbackend.Inheritance.TablePerClass.Services;

import com.dev.scalerbackend.Inheritance.TablePerClass.Models.Student;
import com.dev.scalerbackend.Inheritance.TablePerClass.Repositories.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("tpc_studentService")
public class StudentService {

    StudentRepo studentRepo;

    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
}
