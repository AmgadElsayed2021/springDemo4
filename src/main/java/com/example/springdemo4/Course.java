package com.example.springdemo4;
import javax.persistence.*;

@Entity
public class Course {
    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_generator")
    @SequenceGenerator(name="course_generator", sequenceName = "course_seq", allocationSize=50)
    @Column(name = "courseId", updatable = false, nullable = false)
    private Integer courseId;
    public Integer getCourseId() {return courseId;}
    public void setCourseId(Integer courseId) {this.courseId = courseId;}

    private String courseName;
    public String getCourseName() {return courseName;}
    public void setCourseName(String courseName) {this.courseName = courseName;}

    private int courseNumber;
    public int getCourseNumber() {return courseNumber;}
    public void setCourseNumber(int courseNumber) {this.courseNumber = courseNumber;}

    private int capacity;
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
}
