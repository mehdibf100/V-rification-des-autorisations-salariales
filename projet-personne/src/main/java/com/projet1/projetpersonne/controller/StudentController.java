package com.projet1.projetpersonne.controller;

import com.projet1.projetpersonne.entity.Student;
import com.projet1.projetpersonne.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;


    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) throws Exception {
        return service.getSudentByID(id);
    }
    @GetMapping
   public List<Student> getAllStudent(){
        return service.getAllStudent();
    }



    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) throws Exception {
         service.deleteStudentByID(id);
         return "student delete successfully";
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student) throws Exception {
       return service.updateStudent(student);

    }
}
