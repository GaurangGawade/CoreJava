package com.abc.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.example.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Long>{

}
