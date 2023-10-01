package com.dev.scalerbackend.Controllers;

import com.dev.scalerbackend.Models.BaseModel;
import com.dev.scalerbackend.Models.Currency;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

    @GetMapping("/demo")
    public Currency demoMethod(){
        System.out.println(Enum.valueOf(Currency.class, "INR"));
        return Currency.INR;

    }


}
