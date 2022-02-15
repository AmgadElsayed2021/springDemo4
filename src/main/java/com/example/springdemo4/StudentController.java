package com.example.springdemo4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/student")

public class StudentController {
    @Autowired
    private StudentRepo SR;

    //    add a student
    @PostMapping(path = "/add")
    public @ResponseBody
    String addStudent (@RequestParam String firstName, String lastName, String email,
                       String address, String city, String postal, String phone){
        Student ST =new Student();
        ST.setFirstName(firstName);
        ST.setLastName(lastName);
        ST.setEmail(email);
        ST.setAddress(address);
        ST.setCity(city);
        ST.setPostal(postal);
        ST.setPhone(phone);
        SR.save(ST);
        return "Saved";
    }

    //    list all students
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllStudents() {
        return SR.findAll();
    }


    //needs to be tested
    @GetMapping(path="/find/{id}")
    public @ResponseBody
    Optional<Student> getStudentById(@PathVariable int id) {
        return SR.findById(id);
    }

}
