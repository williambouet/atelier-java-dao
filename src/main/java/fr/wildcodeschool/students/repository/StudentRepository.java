package fr.wildcodeschool.students.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.models.Student;

@Repository
public class StudentRepository implements StudentDao {
    
    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                new Student("Bernard"),
                new Student("Hoagie"),
                new Student("Laverne")
        )
      );

    @Override
    public List<Student> findAll() {
        return students;
    }
}
