package com.dev.scalerbackend.Inheritance.TablePerClass.Services;

import com.dev.scalerbackend.Inheritance.TablePerClass.Models.Mentor;
import com.dev.scalerbackend.Inheritance.TablePerClass.Repositories.MentorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service("tpc_mentorService")
public class MentorService {

    MentorRepo mentorRepo;

    public Mentor saveMentor(Mentor mentor){
        return mentorRepo.save(mentor);
    }

    public List<Mentor> findAllMentors(){
        return mentorRepo.findAll();
    }
}
