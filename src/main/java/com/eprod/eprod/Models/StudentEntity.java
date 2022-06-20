package com.eprod.eprod.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    int id;
    String name;
    String form;

    public StudentEntity() {
    }

    public StudentEntity(String name, String form) {
        this.name = name;
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
