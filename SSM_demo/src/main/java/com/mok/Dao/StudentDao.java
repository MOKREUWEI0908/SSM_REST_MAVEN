package com.mok.Dao;

import com.mok.Component.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {

    public Student findStudent(Integer sid);


}
