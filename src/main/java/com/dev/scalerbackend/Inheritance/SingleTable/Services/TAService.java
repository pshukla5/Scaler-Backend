package com.dev.scalerbackend.Inheritance.SingleTable.Services;

import com.dev.scalerbackend.Inheritance.SingleTable.Models.TA;
import com.dev.scalerbackend.Inheritance.SingleTable.Repositories.TARepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("st_TaService")
public class TAService {

    TARepo taRepo;

    public TA saveTa(TA ta){
        return taRepo.save(ta);
    }

    public List<TA> findAllTa(){
        return taRepo.findAll();
    }


}
