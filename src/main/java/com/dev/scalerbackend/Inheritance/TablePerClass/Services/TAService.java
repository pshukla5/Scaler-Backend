package com.dev.scalerbackend.Inheritance.TablePerClass.Services;

import com.dev.scalerbackend.Inheritance.TablePerClass.Models.TA;
import com.dev.scalerbackend.Inheritance.TablePerClass.Repositories.TARepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("tpc_TaService")
public class TAService {

    TARepo taRepo;

    public TA saveTa(TA ta){
        return taRepo.save(ta);
    }

    public List<TA> findAllTa(){
        return taRepo.findAll();
    }


}
