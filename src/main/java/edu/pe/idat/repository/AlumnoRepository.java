package edu.pe.idat.repository;

import org.springframework.data.repository.CrudRepository;
import edu.pe.idat.model.Alumno;

public interface AlumnoRepository 
	extends CrudRepository<Alumno, String>, AlumnoRepositoryCustom {


}
