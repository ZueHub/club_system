package com.example.club_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.club_system.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
