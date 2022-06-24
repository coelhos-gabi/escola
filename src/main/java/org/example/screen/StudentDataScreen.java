package org.example.screen;


import org.example.dominio.Responsaveis;
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
            System.out.println("Aluno já cadastrado");
        }else{
            System.out.println("Nome do aluno:");
            String nameAluno = scanner.next();
            System.out.println("Nome do responsável 1:");
            String nameResponsavel = scanner.next();
            System.out.println("Telefone para contato");
            String telefone = scanner.next();
            System.out.println("Email para contato");
            String email = scanner.next();

            Student student = new Student(nameAluno, id, new Responsaveis(nameResponsavel,telefone, email));
            StudentsRepository.getInstance().save(student);
            System.out.println("Aluno cadastrado com sucesso!");
            InsertGrades.executar(scanner);
        }
    }
}
