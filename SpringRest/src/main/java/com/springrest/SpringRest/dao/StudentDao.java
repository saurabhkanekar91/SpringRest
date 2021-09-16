package com.springrest.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.SpringRest.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
