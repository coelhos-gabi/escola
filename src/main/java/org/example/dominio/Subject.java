package org.example.dominio;

import java.util.Objects;

public enum Subject {
    MATH("Matematica", "1"),
    GEOGRAPHY("Geografia", "2"),
    ENGLISH("Inglês","3"),
    HISTORY("História","4"),
    LITERATURE("Literatura","5"),
    CHEMISTRY("Química", "6"),
    PHYSICS("Física","7"),
    PHYSICALEDUCATION("Educação Física","8"),
    BIOLOGY("Biologia","9"),
    PORTUGUESE("Português", "10");
    private String description;
    private String code;
    private final double mean = 7.0;
    Subject(String description, String code) {
        this.description = description;
        this.code = code;
    }
    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public static Subject valueOfCode(String opcao) {
        for(Subject subject : Subject.values()){
            if(subject.getCode().equals(opcao)){
                return subject;
            }
        }
        return null;
    }
    public double getMean(){
        return mean;
    }
}

