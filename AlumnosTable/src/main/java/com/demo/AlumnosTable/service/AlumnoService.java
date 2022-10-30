package com.demo.AlumnosTable.service;

import com.demo.AlumnosTable.dao.AlumnoDao;
import com.demo.AlumnosTable.entity.Alumno;


import java.util.List;

public class AlumnoService implements IAlumnoService{

    private AlumnoDao alumnoDao;

    @Override
    public List<Alumno> findAll() {
        return (List<Alumno>) alumnoDao.findAll();
    }

    @Override
    public Alumno findById(Long id) {
        return null;

        }
}
