package com.mok.Service;

import com.mok.Component.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    public Student findStudent(Integer sid);
}
