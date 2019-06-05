package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import fr.wildcodeschool.students.repositories.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentRepoBdx")
    private StudentDao studentDao;

    @ResponseBody
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentDao.findAll();
    }
}