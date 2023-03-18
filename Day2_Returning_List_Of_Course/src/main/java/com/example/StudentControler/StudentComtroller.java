package com.example.StudentControler;

import com.example.courses.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class StudentComtroller {


    @RequestMapping("/courses")
    public List<Courses> Course()
    {
        return Arrays.asList(
                new Courses(1,"DATASCIENCE","KISHAN"),
                new Courses(2,"AWS","YOGESH"),
                new Courses(3,"PYTHON","RAHUL")
        );
    }

}
