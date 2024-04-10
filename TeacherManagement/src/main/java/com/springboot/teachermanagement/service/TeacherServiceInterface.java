package com.springboot.teachermanagement.service;

import com.springboot.teachermanagement.entity.Teacher;

import java.util.List;

public interface TeacherServiceInterface {

    List<Teacher> findAll();

    Teacher findById(int id);

    Teacher update(Teacher teacher);

    void deleteById(int id);


}
