package org.example.dominio;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Subject subject;
    private Student student;
    private double nota;


    public Grade(Subject subject, Student student, double nota) {
        this.subject = subject;
        this.student = student;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return getNota() + " | ";

    }
}
