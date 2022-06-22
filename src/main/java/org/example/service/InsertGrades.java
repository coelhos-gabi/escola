package org.example.service;

import org.example.screen.grade.SaveGradeScreen;

import java.util.Scanner;

public class InsertGrades {
    public static void executar(Scanner scanner) {
        System.out.println("Deseja inserir as notas do aluno?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int option = scanner.nextInt();
        if(option == 1){
            SaveGradeScreen.run(scanner);
        }else{
            return;
        }
    }
}
