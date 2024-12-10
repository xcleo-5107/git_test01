package com.example.gittest01.dao;

import com.example.gittest01.pojo.PojoStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<PojoStudent,String> {
}
