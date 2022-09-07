package asociaciones;

import java.util.Arrays;

public class Curso {

	private int nroComision;
	private String nombre;
	private int cantAlumnos;
	private Profesor profesor;
	private Alumno [] alumnos;
	
	
	public Curso(int nroComision, String nombre, int cantAlumnos, Profesor profesor, Alumno[] alumnos) {
		super();
		this.nroComision = nroComision;
		this.nombre = nombre;
		this.cantAlumnos = cantAlumnos;
		this.profesor = profesor;
		this.alumnos = alumnos;
	}


	public int getNroComision() {
		return nroComision;
	}


	public void setNroComision(int nroComision) {
		this.nroComision = nroComision;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantAlumnos() {
		return cantAlumnos;
	}


	public void setCantAlumnos(int cantAlumnos) {
		this.cantAlumnos = cantAlumnos;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public Alumno[] getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}


	@Override
	public String toString() {
		return "Curso [nroComision=" + nroComision + ", nombre=" + nombre + ", cantAlumnos=" + cantAlumnos
				+ ", profesor=" + profesor + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}
	
}
