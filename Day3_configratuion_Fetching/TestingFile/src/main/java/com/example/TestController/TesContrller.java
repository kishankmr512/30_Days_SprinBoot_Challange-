package com.example.TestController;


import com.example.Configration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesContrller {

    @Autowired
    private Configuration configuration;

    @PostMapping("Kishan")
    public Configuration ConfigLoad()
    {
        return configuration;
    }
    

}
