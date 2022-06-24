package org.example;

import org.example.dominio.Init;
import org.example.dominio.OpcaoTela;
import org.example.screen.grade.SaveGradeScreen;
import org.example.screen.StudentDataScreen;
import org.example.screen.WhichSubjectScreen;

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
        int option = 0;
        do {
            System.out.println("*********** Escola Toca do Coelho ***********");
            System.out.println("O que deseja fazer?");
            for(OpcaoTela opcaoTela : OpcaoTela.values()){
                System.out.println(opcaoTela.getCode() + " - "+opcaoTela.getLabel());
            }

            try {
                String stringOption = scanner.next();
                option = Integer.parseInt(stringOption);

                switch (option) {
                    case 1:
                        StudentDataScreen.run(scanner);
                        break;
                    case 2:
                        WhichSubjectScreen.run(scanner);
                        break;
                    case 3:
                        SaveGradeScreen.run(scanner);
                        break;
                    case 0:
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }catch (Exception exception){
                System.out.println("Entrada inválida, tente novamente");
            }
        }while(option!=0);
    }
}
