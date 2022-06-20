package org.example;

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
        System.out.println("*********** Escola Toca do Coelho ***********");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Acessar notas");
        System.out.println("0 - Sair ");
    }

}
