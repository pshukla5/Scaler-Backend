package com.dev.scalerbackend.Inheritance.JoinedTable.Services;

import com.dev.scalerbackend.Inheritance.JoinedTable.Models.Mentor;
import com.dev.scalerbackend.Inheritance.JoinedTable.Repositories.MentorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service("jt_mentorService")
public class MentorService {

    MentorRepo mentorRepo;

    public Mentor saveMentor(Mentor mentor){
        return mentorRepo.save(mentor);
    }

    public List<Mentor> findAllMentors(){
        return mentorRepo.findAll();
    }
}
