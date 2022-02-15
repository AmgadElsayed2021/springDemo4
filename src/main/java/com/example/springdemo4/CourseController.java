package com.example.springdemo4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping(path = "/course")
public class CourseController {
    @Autowired
    private  CourseRepo CR;


    //    add a Course
    @PostMapping(path = "/add")
    public @ResponseBody String addCourse (@RequestParam String courseName,int courseNumber,int capacity){
        Course CRS =new Course();
        CRS.setCourseName(courseName);
        CRS.setCourseNumber(courseNumber);
        CRS.setCapacity(capacity);
        CR.save(CRS);
        return "Saved";
    }

//    list all Courses
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Course> getAllCourses() {
        return CR.findAll();
}


//needs to be tested
//    passed testing
    @GetMapping(path="/find/{id}")
    public @ResponseBody Optional<Course> getCourseById(@PathVariable int id) {
        return CR.findById(id);
    }

}
