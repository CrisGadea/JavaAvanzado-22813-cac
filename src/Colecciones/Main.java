package Colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import asociaciones.Alumno;
import asociaciones.Profesor;

public class Main {

	public static void main(String[] args) {
		// Utilizamos la Interface List para generar una lista dinamica
		
		// Creamos un ArrayList de Alumnos
		List<Alumno> alumnos = new ArrayList<Alumno>();
		List<Profesor> profesores = new LinkedList<Profesor>();
		
		Alumno alumno1 = new Alumno (5555555, "Johny", "Doe", "Masculino", "johny@doe.com", 1);
		Alumno alumno2 = new Alumno (6666666, "Johana", "Dina", "Femenino", "johana@doe.com", 2);
		Alumno alumno3 = new Alumno (7777777, "Jessica", "Doent", "Femenino", "jessica@doe.com", 3);
		
		Profesor profe1 = new Profesor(3333333, "John", "Doe", "Masculino", "john@doe.com", 1);
		Profesor profe2 = new Profesor(2222222, "Cleo", "Doe", "No Binario", "cleo@doe.com", 2);
		
		
		profesores.add(profe1);
		profesores.add(profe2);
		
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		
		System.out.println("La cantidad de elementos guardados en la Lista de Alumnos es de: " + alumnos.size());
		System.out.println("El alumno " + alumnos.get(0).getNombre() + " tiene DNI número: " + alumnos.get(0).getDni());

		
		System.out.println("La cantidad de elementos guardados en la Lista de Profesores es de: " + profesores.size());
		System.out.println("El profesor " + profesores.get(0).getNombre() + " tiene DNI número: " + profesores.get(0).getDni());

		// For Extendido: ForEach
		for (Alumno alumno : alumnos) {
			if (alumno.getDni() == 6666666) {
				System.out.println("Encontramos a " + alumno.getNombre());
			} 
		}
		
		// Mostrar todos los nombres y apellidos de cada alumno en la lista
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		}
	}

}
