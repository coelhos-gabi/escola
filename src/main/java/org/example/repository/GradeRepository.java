package org.example.repository;

import org.example.dominio.Grade;
import org.example.dominio.Subject;

import java.util.ArrayList;
import java.util.Comparator;

public class GradeRepository extends AbstractListRepository<Grade>
        implements IRepository<Grade>, Comparator<Grade> {
    private static GradeRepository gradeRepository;
    private ArrayList<Grade> gradesRegistered;

    private GradeRepository() {
        super();
        gradesRegistered = new ArrayList<>();
    }

    public static GradeRepository getInstance() {
        if (gradeRepository == null) {
            gradeRepository = new GradeRepository();
        }
        return gradeRepository;
    }

    @Override
    public void save(Grade subject) {
        gradesRegistered.add(subject);
    }
    @Override
    public Grade read(String id) {
        for (Grade gradeRegistered : gradesRegistered) {
            if (gradeRegistered.getStudent().getId().equals(id)) {
                return gradeRegistered;
            }
        }
        return null;
    }

    @Override
    public int compare(Grade grade, Grade grade1) {
        return grade.getStudent().getId().compareTo(grade1.getStudent().getId());
    }

    public ArrayList<Grade> getGradesRegistered() {
        return gradesRegistered;
    }
}

