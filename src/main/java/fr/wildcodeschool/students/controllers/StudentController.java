package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @ResponseBody
    @GetMapping("/students")
    public List<Student> getStudents() {
        return findAll();
    }

    private List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bernard"));
        students.add(new Student("Hoagie"));
        students.add(new Student("Laverne"));
        return students;
    }
}