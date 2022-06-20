package com.eprod.eprod.Repository;

import com.eprod.eprod.Models.FormEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormRepository extends JpaRepository<FormEntity, Integer> {
    List<FormEntity> findByFormContaining(String form);
}
