package com.eprod.eprod.Repository;

import com.eprod.eprod.Models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<StudentEntity, Integer> {
}
