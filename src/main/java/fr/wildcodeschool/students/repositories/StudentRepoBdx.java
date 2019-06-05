package fr.wildcodeschool.students.repositories;

import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoBdx implements StudentDao {

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Michèle"));
        students.add(new Student("Jean-Noël"));
        students.add(new Student("Bertrand"));
        students.add(new Student("Jacquis"));
        return students;
    }
}
