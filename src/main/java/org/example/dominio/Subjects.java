package org.example.dominio;

public class Subjects {

    private String teacher;
    private String subjectId;
    private final double notaMinima = 7.0;

    public Subjects(String teacher, String subjectId) {
        this.teacher = teacher;
        this.subjectId = subjectId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public double getNotaMinima() {
        return notaMinima;
    }
}
