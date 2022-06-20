package org.example.screen;

import org.example.dominio.Student;
import org.example.repository.StudentsRepository;
import org.example.service.CheckStudent;
import org.example.service.PrintAllsubjects;
import org.example.service.PrintOneSubject;

import java.util.Scanner;

public class WhichSubjectScreen {
    public static void executar(Scanner scanner){
        System.out.println("0 - Todas as disciplinas");
        System.out.println("1 - Matemática");
        System.out.println("2 - Geografia");
        System.out.println("3 - Inglês");
        System.out.println("4 - História");
        System.out.println("5 - Literatura");
        System.out.println("6 - Português");
        System.out.println("7 - Química");
        System.out.println("8 - Física");
        System.out.println("9 - Educação Física");
        System.out.println("10 - Biologia");
        String option = scanner.next();

        System.out.println("Insira a matrícula do aluno");
        String id = scanner.next();
        if (CheckStudent.studentExist(id)) {
            Student student = StudentsRepository.getInstance().read(id);
            System.out.println("Aluno: "+ student.getName());
            PrintOneSubject gradesReport = new PrintOneSubject();
            report.executar(id);
        } else {
            System.out.println("Aluno não encontrado");
        }

    }
}
