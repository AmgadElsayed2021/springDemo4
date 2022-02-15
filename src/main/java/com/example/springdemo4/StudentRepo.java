package com.example.springdemo4;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student ,Integer> {

}
