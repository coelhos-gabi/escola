package org.example.service;

import org.example.repository.SubjectRepository;

public class CheckStudent {

    public static boolean studentExist(String id){
        return SubjectRepository.getInstance().read(id) == null;
    }
}
