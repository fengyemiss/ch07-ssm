package com.offcn.dao;

import com.offcn.domain.Student;

import java.util.List;

public interface StudentDao {
    int add(Student student);

    List<Student> select();
}
