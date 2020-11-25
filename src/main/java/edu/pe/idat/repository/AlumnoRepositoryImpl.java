package edu.pe.idat.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import edu.pe.idat.model.Alumno;

public class AlumnoRepositoryImpl implements AlumnoRepositoryCustom  
{

    @PersistenceContext
    private EntityManager em;
	
	@Override
	public List<Alumno> obtenerTodosLosAlumnos() {
		 StoredProcedureQuery objListarAlumnos =
				 em.createNamedStoredProcedureQuery("ListarAlumno");
		 List<Alumno> resultList = objListarAlumnos.getResultList();
		return resultList;
	}

}
