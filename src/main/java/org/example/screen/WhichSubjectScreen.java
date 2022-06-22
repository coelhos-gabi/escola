package org.example.screen;

import org.example.dominio.Student;
import org.example.dominio.Subject;
import org.example.repository.StudentsRepository;
import org.example.service.CheckStudent;
import org.example.service.ReportService;
import org.example.service.report.PrintAllsubjects;
import org.example.service.report.PrintOneSubject;

import java.util.Scanner;

public class WhichSubjectScreen {
    public static void run(Scanner scanner){
        System.out.println("Quais disciplinas deseja acessar?");
        System.out.println("0 - Todas as disciplinas");
        System.out.println("1 - Matemática");
        System.out.println("2 - Geografia");
        System.out.println("3 - Inglês");
        System.out.println("4 - História");
        System.out.println("5 - Literatura");
        System.out.println("6 - Química");
        System.out.println("7 - Física");
        System.out.println("8 - Educação Física");
        System.out.println("9 - Biologia ");
        System.out.println("10 - Português");
        try {
            String option = scanner.next();
            HowToAccessGradeScreen.run(scanner, option);
        }catch (Exception exception){
            System.out.println("Entrada inválida, tente novamente");
        }
    }
}
