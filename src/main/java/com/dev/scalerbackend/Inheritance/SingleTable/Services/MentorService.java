package com.dev.scalerbackend.Inheritance.SingleTable.Services;

import com.dev.scalerbackend.Inheritance.SingleTable.Models.Mentor;
import com.dev.scalerbackend.Inheritance.SingleTable.Repositories.MentorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service("st_mentorService")
public class MentorService {

    MentorRepo mentorRepo;

    public Mentor saveMentor(Mentor mentor){
        return mentorRepo.save(mentor);
    }

    public List<Mentor> findAllMentors(){
        return mentorRepo.findAll();
    }
}
