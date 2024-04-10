package com.springboot.teachermanagement.service;

import com.springboot.teachermanagement.entity.Teacher;
import com.springboot.teachermanagement.repo.TeacherRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements TeacherServiceInterface{

    @Autowired
    private TeacherRepo teacherRepo;

    @Override
  public List<Teacher> findAll(){
      return teacherRepo.findAll();
  }

    @Override
    public Teacher findById(int id) {
        Optional<Teacher> result = teacherRepo.findById(id);
        Teacher teacher = null;
        if(result.isPresent()){
            teacher = result.get();
        }else{
            throw new RuntimeException("Teacher not found");
        }
        return teacher;
    }
@Transactional
    @Override
    public Teacher update(Teacher teacher) {
        return teacherRepo.save(teacher);
    }
@Transactional
    @Override
    public void deleteById(int id) {
    teacherRepo.deleteById(id);
    }


}
