package com.springboot.teachermanagement.repo;

import com.springboot.teachermanagement.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
