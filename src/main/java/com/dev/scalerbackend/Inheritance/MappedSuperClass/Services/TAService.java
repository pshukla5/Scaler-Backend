package com.dev.scalerbackend.Inheritance.MappedSuperClass.Services;

import com.dev.scalerbackend.Inheritance.MappedSuperClass.Models.TA;
import com.dev.scalerbackend.Inheritance.MappedSuperClass.Repositories.TARepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("ms_TaService")
public class TAService {

    TARepo taRepo;

    private TA saveTa(TA ta){
        return taRepo.save(ta);
    }

    private List<TA> findAllTa(){
        return taRepo.findAll();
    }


}
