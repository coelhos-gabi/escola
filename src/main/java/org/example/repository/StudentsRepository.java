package org.example.repository;

import org.example.dominio.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentsRepository extends AbstractListRepository<Student> implements IRepository<Student>, Comparator<Student> {

    private static StudentsRepository studentsRepository;
    private ArrayList<Student> studentsRegistered;

    private StudentsRepository() {
        super();
        studentsRegistered = new ArrayList<>();
    }

    public static StudentsRepository getInstance() {
        if (studentsRepository == null) {
            studentsRepository = new StudentsRepository();
        }
        return studentsRepository;
    }

    @Override
    public void save(Student aluno) {
        studentsRegistered.add(aluno);
    }
    @Override
    public Student read(String id) {
        for (Student studentRegistered : studentsRegistered) {
            if (studentRegistered.getId().equals(id)) {
                return studentRegistered;
            }
        }
        return null;
    }

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getId().compareTo(student2.getId());
    }

    public ArrayList<Student> getStudentsRegistered() {
        return studentsRegistered;
    }
}

