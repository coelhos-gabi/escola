package org.example.repository;


import org.example.dominio.Subject;

import java.util.ArrayList;
import java.util.Comparator;

public class SubjectRepository extends AbstractListRepository<Subject>
        implements IRepository<Subject>, Comparator<Subject> {
    private static SubjectRepository subjectsRepository;
    private ArrayList<Subject> subjectsRegistered;

    private SubjectRepository() {
        super();
        subjectsRegistered = new ArrayList<>();
    }

    public static SubjectRepository getInstance() {
        if (subjectsRepository == null) {
            subjectsRepository = new SubjectRepository();
        }
        return subjectsRepository;
    }

    @Override
    public void save(Subject subject) {
        subjectsRegistered.add(subject);
    }
    @Override
    public Subject read(String id) {
        for (Subject subjectRegistered : subjectsRegistered) {
            if (subjectRegistered.getId().equals(id)) {
                return subjectRegistered;
            }
        }
        return null;
    }

    @Override
    public int compare(Subject subject, Subject subject1) {
        return subject.getId().compareTo(subject1.getId());
    }

    public ArrayList<Subject> getSubjectsRegistered() {
        return subjectsRegistered;
    }
}
