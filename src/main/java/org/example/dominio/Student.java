package org.example.dominio;

public class Student extends Registration{
    private Responsaveis responsavel;
    private String serie;


    public Student(String name, String id, Responsaveis responsavel) {
        super(name, id);
        this.responsavel = responsavel;
    }

    public Responsaveis getResponsavel() {
        return responsavel;
    }
}
