package com.offcn.service;

import com.offcn.domain.Student;

import java.util.List;

public interface StudentService {
    int add(Student student);

    List<Student> select();
}
