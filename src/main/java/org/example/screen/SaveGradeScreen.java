package org.example.screen;

import org.example.dominio.Grade;
import org.example.dominio.Student;
import org.example.dominio.Subject;
import org.example.repository.GradeRepository;
import org.example.repository.StudentsRepository;
import org.example.repository.SubjectRepository;

import java.util.Scanner;

public class SaveGradeScreen {

    public static void executar(Scanner scanner){
        System.out.println("Insira a matricula do aluno:");
        String id = scanner.next();
        Student student = StudentsRepository.getInstance().read(id);
        if (student != null){
            System.out.println("Insira o número de ID da matéria:");
            String idMateria = scanner.next();
            Subject subject = SubjectRepository.getInstance().read(idMateria);
            int i = 0;
            while (i<4){
                double nota;
                System.out.printf("Insira a nota do %dºBimestre%n", i+1);
                nota = scanner.nextDouble();
                if(nota < 0 || nota >10){
                    System.out.println("Nota inválida");
                } else{
                    Grade grade = new Grade(subject, student, nota);
                    GradeRepository.getInstance().save(grade);
                    i++;
                }
            }
        }else{
            System.out.println("Aluno não encontrado");
        }
    }
}
