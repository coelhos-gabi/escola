package org.example.service;

import org.example.dominio.Grade;
import org.example.dominio.Student;
import org.example.repository.GradeRepository;
import org.example.repository.StudentsRepository;

import java.util.Scanner;

public class PrintOneSubject {

    public static void report(String idMateria, Scanner scanner){

        for (Grade grade : GradeRepository.getInstance().getGradesRegistered()) {

        }
    }
}
