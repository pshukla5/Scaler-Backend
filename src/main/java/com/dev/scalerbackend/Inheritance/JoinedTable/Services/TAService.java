package com.dev.scalerbackend.Inheritance.JoinedTable.Services;

import com.dev.scalerbackend.Inheritance.JoinedTable.Models.TA;
import com.dev.scalerbackend.Inheritance.JoinedTable.Repositories.TARepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("jt_TaService")
public class TAService {

    TARepo taRepo;

    public TA saveTa(TA ta){
        return taRepo.save(ta);
    }

    public List<TA> findAllTa(){
        return taRepo.findAll();
    }


}
