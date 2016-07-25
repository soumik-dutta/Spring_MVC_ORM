package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Student;

import java.util.List;

/**
 * Created by omoto on 25/7/16.
 */
public interface StudentDao {

    Student findById(int id);

    void save(Student student);

    List<Student> findAllUsers();
}
