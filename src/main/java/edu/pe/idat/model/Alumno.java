package edu.pe.idat.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

//import lombok.Data;
 

@Entity
@Table(name = "alumnostemp")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
			name = "ListarAlumno",
			procedureName = "sp_ListarAlumno",
			resultClasses = {Alumno.class}
			)
	
})
public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idalumno", nullable = false)
	private String IdAlumno;
	@Column(name = "nomalumno", nullable = false)
	private String NomAlumno;
	@Column(name = "apealumno", nullable = false)
	private String ApeAlumno;
	
	public Alumno() {
		
	}
	
	
	public String getIdAlumno() {
		return IdAlumno;
	}




	public void setIdAlumno(String idAlumno) {
		IdAlumno = idAlumno;
	}




	public String getNomAlumno() {
		return NomAlumno;
	}




	public void setNomAlumno(String nomAlumno) {
		NomAlumno = nomAlumno;
	}




	public String getApeAlumno() {
		return ApeAlumno;
	}




	public void setApeAlumno(String apeAlumno) {
		ApeAlumno = apeAlumno;
	}




	public Alumno(String idAlumno, String nomAlumno, String apeAlumno) {
		super();
		IdAlumno = idAlumno;
		NomAlumno = nomAlumno;
		ApeAlumno = apeAlumno;
	}




	@Override
	public String toString() {
	return "Curso [idalumno="+ IdAlumno+ 
			", NomAlumno="+ NomAlumno + 
			", ApeAlumno="+ ApeAlumno +"]";
	}

}
