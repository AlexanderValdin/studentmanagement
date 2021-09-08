package com.valdin.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdin.studentmanagement.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
