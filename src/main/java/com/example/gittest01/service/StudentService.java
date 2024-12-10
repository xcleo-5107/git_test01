package com.example.gittest01.service;

import com.example.gittest01.dao.StudentDao;
import com.example.gittest01.pojo.PojoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceImpl{
    @Autowired
    private StudentDao studentDao;

    @Override
    public PojoStudent findStudentByStudentId(String id) {
        return studentDao.findById(id).orElse(null);
    }
}
