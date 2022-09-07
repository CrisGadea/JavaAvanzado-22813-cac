package asociaciones;

import java.util.Arrays;

public class Universidad {

	private String nombre;
	private int cantAlumnos, cantDocentes;
	private Profesor [] profesores;
	private Alumno [] alumnos;
	private Curso [] cursos;
	
	/**
	 * Constructor completo de la Clase Universidad con todos sus campos.
	 * @param nombre
	 * @param profesores
	 * @param cantAlumnos
	 * @param cantDocentes
	 * @param alumnos
	 * @param cursos
	 */
	public Universidad(String nombre, Profesor[] profesores, int cantAlumnos, int cantDocentes, Alumno[] alumnos,
			Curso[] cursos) {
		this.nombre = nombre;
		this.profesores = profesores;
		this.cantAlumnos = cantAlumnos;
		this.cantDocentes = cantDocentes;
		this.alumnos = alumnos;
		this.cursos = cursos;
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

	public int getCantDocentes() {
		return cantDocentes;
	}

	public void setCantDocentes(int cantDocentes) {
		this.cantDocentes = cantDocentes;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Universidad [nombre=" + nombre + ", cantAlumnos=" + cantAlumnos + ", cantDocentes=" + cantDocentes
				+ ", profesores=" + Arrays.toString(profesores) + ", alumnos=" + Arrays.toString(alumnos) + ", cursos="
				+ Arrays.toString(cursos) + "]";
	}
	
	
	
}
