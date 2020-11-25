package edu.pe.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.pe.idat.model.*;
import edu.pe.idat.repository.AlumnoRepository;

@RestController
@RequestMapping("/academico/alumno")
public class AlumnoController {
	
    @Autowired
    AlumnoRepository alumnoRepository;
    
    @GetMapping("/lista")
    public List<Alumno> lista(){
        List<Alumno> lista = alumnoRepository.obtenerTodosLosAlumnos();
        return lista;
    }

}
