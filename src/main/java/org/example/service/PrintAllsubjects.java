package org.example.service;

import org.example.dominio.Grade;
import org.example.dominio.Subject;
import org.example.repository.GradeRepository;
import org.example.repository.SubjectRepository;

public class PrintAllsubjects {
    public void executar(String id){
        for (Subject subject: SubjectRepository.getInstance().getSubjectsRegistered()) {
            System.out.println("----------------------------------");
            System.out.println(subject.getName());
            double soma = 0;
            for (Grade grade : GradeRepository.getInstance().getGradesRegistered()) {
                if(grade.getSubject().equals(subject)) {
                    if (grade.getStudent().getId().equals(id)) {
                        System.out.print(grade);
                        soma += grade.getNota();
                    }
                }
            }
            System.out.println();
            System.out.println("----------------------------------");
            System.out.printf("Média: %.1f %n", soma/4);
            String status = (soma/4) >= subject.getMedia() ? "Aprovado" : "Reprovado";
            System.out.println("Status: " + status);
        }
        System.out.println("----------------------------------");
    }
}
