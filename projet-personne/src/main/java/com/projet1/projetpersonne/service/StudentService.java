package com.projet1.projetpersonne.service;

import com.projet1.projetpersonne.entity.Student;
import com.projet1.projetpersonne.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    StudentRespository respository;
    public Student saveStudent(Student student){
    Student saveStudent=respository.save(student);
    System.out.println(saveStudent);
    return saveStudent;
    }
    public Student getSudentByID(Integer id) throws Exception {
        return respository.findById(id).orElseThrow(()-> new Exception("Student no found where id: "+id));
    }
    public List<Student> getAllStudent(){
        return respository.findAll();
    }
    public void deleteStudentByID(Integer id) throws Exception {
        respository.findById(id).orElseThrow(()-> new Exception("Student no found with id: "+id));
        respository.deleteById(id);
        System.out.println("Student deleted with id : "+id);

    }

    public Student updateStudent(Student student) throws Exception {
        respository.findById(student.getId()).orElseThrow(()-> new Exception("Student no found with id: "+student.getId()));
        return respository.save(student);
    }
}
