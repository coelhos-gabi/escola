package org.example.screen;

import org.example.dominio.Student;
import org.example.repository.StudentsRepository;
import org.example.service.CheckStudent;
import org.example.service.PrintAllsubjects;

import java.util.Scanner;

public class ReadGradeScreen {
    public static void executar(Scanner scanner) {

        System.out.println("Insira a matrícula do aluno");
        String id = scanner.next();
        if (CheckStudent.studentExist(id)) {
            Student student = StudentsRepository.getInstance().read(id);
            System.out.println("Aluno: "+ student.getName());
            PrintAllsubjects gradesReport = new PrintAllsubjects();
            gradesReport.executar(id);
        } else {
            System.out.println("Aluno não encontrado");
        }
    }
}
