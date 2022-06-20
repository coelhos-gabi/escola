package org.example;

import org.example.dominio.Init;
import org.example.screen.ReadGradeScreen;
import org.example.screen.SaveGradeScreen;
import org.example.screen.StudentDataScreen;

import java.util.Scanner;

/**
 * Uma escola esta pedindo a sua ajuda para criar um sistema que permita o cadastro de novos alunos,
 * bem como o lançamento e a exibição das notas de uma determinada disciplina e a exibição do boletim escolar.
 * A funcionalidade de exibição do boletim permite o envio da mesma para os pais e esta pode ser enviada de
 * três formas.
 *
 *     Email
 *     Mensagem no celular
 *     Impressão do boletim e entrega na reunião de pais e alunos
 *
 * Construa esse sistema utilizando os príncipios de responsabilidade única e Aberto-fechado do SOLID.
 *
 */
public class App{

    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        Init.executar();
        int option;
        do {
            System.out.println("*********** Escola Toca do Coelho ***********");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Acessar notas");
            System.out.println("3 - Registrar notas no sistema");
            System.out.println("0 - Sair ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    StudentDataScreen.executar(scanner);
                    break;
                case 2:
                    ReadGradeScreen.executar(scanner);
                    break;
                case 3:
                    SaveGradeScreen.executar(scanner);
                    break;
            }
        }while(option!=0);
    }

}
