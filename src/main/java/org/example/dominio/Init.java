package org.example.dominio;

import org.example.repository.GradeRepository;
import org.example.repository.StudentsRepository;

public class Init {
    public static void executar() {
        Student student1 = new Student("Jonas","11");
        Student student2 = new Student("Pamela","22");
        Student student3 = new Student("Gabriela", "33");
        Student student4 = new Student("José","44");
        Student student5 = new Student("Amanda","55");
        StudentsRepository.getInstance().save(student1);
        StudentsRepository.getInstance().save(student2);
        StudentsRepository.getInstance().save(student3);
        StudentsRepository.getInstance().save(student4);
        StudentsRepository.getInstance().save(student5);

        Grade grade1 = new Grade(Subject.MATH,student3,9.0);
        Grade grade2 = new Grade(Subject.MATH,student3,7.0);
        Grade grade3 = new Grade(Subject.MATH,student3,8.0);
        Grade grade4 = new Grade(Subject.MATH,student3,10.0);
        Grade grade5 = new Grade(Subject.BIOLOGY,student3,3.0);
        Grade grade6 = new Grade(Subject.BIOLOGY,student3,4.0);
        Grade grade7 = new Grade(Subject.BIOLOGY,student3,2.0);
        Grade grade8 = new Grade(Subject.BIOLOGY,student3,2.0);

        GradeRepository.getInstance().save(grade1);
        GradeRepository.getInstance().save(grade2);
        GradeRepository.getInstance().save(grade3);
        GradeRepository.getInstance().save(grade4);
        GradeRepository.getInstance().save(grade5);
        GradeRepository.getInstance().save(grade6);
        GradeRepository.getInstance().save(grade7);
        GradeRepository.getInstance().save(grade8);
    }
}
