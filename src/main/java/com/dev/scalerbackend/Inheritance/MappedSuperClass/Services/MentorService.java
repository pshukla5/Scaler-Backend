package com.dev.scalerbackend.Inheritance.MappedSuperClass.Services;

import com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories.MentorRepo;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.Mentor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service("ms_mentorService")
public class MentorService {

    MentorRepo mentorRepo;

    public Mentor saveMentor(Mentor mentor){
        return mentorRepo.save(mentor);
    }

    public List<Mentor> findAllMentors(){
        return mentorRepo.findAll();
    }
}
