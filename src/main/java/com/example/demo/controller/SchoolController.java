package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school")
public class SchoolController {

    private final StudentRepository studentRepository;

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student _student = studentRepository.save(student);
        return new ResponseEntity<>(_student, HttpStatus.CREATED);
    }

    @PostMapping("/teacher/{teacherId}/addStudent")
    public ResponseEntity<Teacher> addStudent(@PathVariable(value = "teacherId") Long teacherId, @RequestBody Student student) {
        return null;
    }

    @GetMapping("/teacher/{teacherId}/students")
    public ResponseEntity<Set<Student>> getStudentsOfATeacher(@PathVariable(value = "teacherId") Long teacherId) {
        return null;
    }

    @GetMapping("/student/{studentId}/teachers")
    public ResponseEntity<Set<Teacher>> getTeachersOfAStudent(@PathVariable(value = "studentId") Long studentId) {
        return null;
    }

}
