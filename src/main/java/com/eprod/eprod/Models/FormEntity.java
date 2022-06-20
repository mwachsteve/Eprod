package com.eprod.eprod.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class_stream")
public class FormEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="Form")
    private String Form;
    @Column(name="Stream")
    private String Stream;

    public FormEntity() {
    }

    public FormEntity(String Form, String stream) {
        Form = Form;
        Stream = stream;
    }

//    @Override
    public String getForm() {
        return Form;
    }

    public void setForm(String Form) {
        Form = Form;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }
}
