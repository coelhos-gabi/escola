package org.example.screen;


import org.example.dominio.Student;
import org.example.repository.StudentsRepository;
import org.example.service.CheckStudent;
import org.example.service.InsertGrades;

import java.util.Scanner;

public class StudentDataScreen {
    public static void run(Scanner scanner){
        System.out.println("Insira a matrícula do aluno:");
        String id = scanner.next();

        if(CheckStudent.studentExist(id)) {
            System.out.println("Insira o nome do aluno:");
            String name = scanner.next();
            Student student = new Student(name, id);
            StudentsRepository.getInstance().save(student);
            System.out.println("Aluno cadastrado com sucesso!");
            InsertGrades.executar(scanner);
        }else{
            System.out.println("Aluno já cadastrado");
        }
    }
}
