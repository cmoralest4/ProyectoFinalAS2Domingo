package com.demo.AlumnosTable.controller;

import com.demo.AlumnosTable.entity.Alumno;
import com.demo.AlumnosTable.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AlumnoController {
    @Autowired
    private Environment env;
    @Autowired
    private IAlumnoService alumnoService;
    @GetMapping("/alumno")
    public List<Alumno>listar(){
        return alumnoService.findAll().stream().map(alumno ->  {
            alumno.setPort(Integer.parseInt(env.getProperty("local.server.port")));
            return alumno;
        }).collect(Collectors.toList());
    }
}
