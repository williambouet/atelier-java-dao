package fr.wildcodeschool.students.repository;

import java.util.List;


import fr.wildcodeschool.students.models.Student;


public interface StudentDao {
    
    List<Student> findAll();
}
