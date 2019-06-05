package fr.wildcodeschool.students.repositories;

import fr.wildcodeschool.students.models.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();
}
