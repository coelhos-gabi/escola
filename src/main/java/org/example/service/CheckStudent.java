package org.example.service;


import org.example.repository.StudentsRepository;

public class CheckStudent {

    public static boolean studentExist(String id){
        return StudentsRepository.getInstance().read(id) != null;
    }
}
