package com.example.springdemo4;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course ,Integer> {
}
