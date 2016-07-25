package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Student;

/**
 * Created by omoto on 25/7/16.
 */
public interface StudentDao {

    Student findById(int id);
}
