package com.mok.Service;

import com.mok.Component.Student;
import com.mok.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired(required = false)
    public StudentDao studentDao;

    @Override
    public Student findStudent(Integer sid) {
        Student stu = studentDao.findStudent(sid);
        return stu;
    }

}
