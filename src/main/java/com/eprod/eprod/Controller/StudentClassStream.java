package com.eprod.eprod.Controller;

import com.eprod.eprod.Models.FormEntity;
import com.eprod.eprod.Models.StudentEntity;
import com.eprod.eprod.Repository.FormRepository;
import com.eprod.eprod.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class StudentClassStream {
    @Autowired
    FormRepository formRepository;
    @Autowired
    StudentsRepository studentsRepository;

    @PostMapping("/register-class-stream")
    public FormEntity postForm(@RequestBody FormEntity formEntity)
    {
        System.out.println("test" + formEntity.getForm());
        FormEntity _formEntity = formRepository.save(formEntity);
        return _formEntity;
    }
    @GetMapping("/view-streams")
    public List<FormEntity> viewStreams()
    {
        List<FormEntity> formEntities = new ArrayList<FormEntity>();
        formEntities = formRepository.findAll();
        return formEntities;
    }
    @GetMapping("/view-stream-single-class")
            public List<FormEntity> SingleStream(@RequestParam(required = true) String form)
    {
        List<FormEntity> formEntities = new ArrayList<FormEntity>();
        formEntities = formRepository.findByFormContaining(form);
        return formEntities;
    }

    @PostMapping("/register-student")
    public StudentEntity postForm(@RequestBody StudentEntity formEntity)
    {
        System.out.println("test" + formEntity.getForm());
        StudentEntity _studentEntity = studentsRepository.save(formEntity);
        return _studentEntity;
    }

}
