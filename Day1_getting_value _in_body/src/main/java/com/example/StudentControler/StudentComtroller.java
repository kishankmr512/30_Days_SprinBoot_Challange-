package com.example.StudentControler;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/abc")
public class StudentComtroller {
    
    @PostMapping("/api")
    public String Home(@RequestBody String name){
        return  "Hello "+name;
    }


}
