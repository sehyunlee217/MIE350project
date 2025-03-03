package com.example.cms.controller;

import com.example.cms.controller.exceptions.ClassroomNotFoundException;
import com.example.cms.controller.exceptions.StudentNotFoundException;
import com.example.cms.model.entity.Classroom;
import com.example.cms.model.entity.Student;
import com.example.cms.model.repository.ClassroomRepository;
import com.example.cms.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController

public class ClassroomController {
    @Autowired
    private final ClassroomRepository repository;

    public ClassroomController(ClassroomRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/classroom")
    List<Classroom> retrieveAllClassrooms() {
        return repository.findAll();
    }

    @GetMapping("/classroom/{code}")
    Classroom retrieveClassroom(@PathVariable("code") String classcode) {
        return repository.findById(classcode).orElseThrow(() -> new ClassroomNotFoundException(classcode));
    }
}
