package com.demo.AlumnosTable.service;

import com.demo.AlumnosTable.entity.Alumno;


import java.util.List;

public interface IAlumnoService {

    public List<Alumno> findAll();
    public Alumno findById(Long id);
}
