package asociaciones;

public class Main {


	public static void main(String[] args) {
		// Declaración de las listas a usar
		Alumno [] alumnos;
		Profesor [] profesores;
		Curso [] cursos;
		
		// Generamos las instancias de los objetos necesarios y de las listas (Arrays)
		Profesor profe1 = new Profesor(3333333, "John", "Doe", "Masculino", "john@doe.com", 1);
		Profesor profe2 = new Profesor(2222222, "Cleo", "Doe", "No Binario", "cleo@doe.com", 2);
		
		profesores = new Profesor[2];
		
		profesores[0] = profe1;
		profesores[1] = profe2;
		
		Alumno alumno1 = new Alumno (5555555, "Johny", "Doe", "Masculino", "johny@doe.com", 1);
		Alumno alumno2 = new Alumno (6666666, "Johana", "Doe", "Femenino", "johana@doe.com", 2);
		Alumno alumno3 = new Alumno (7777777, "Jessica", "Doe", "Femenino", "jessica@doe.com", 3);
		//Asignación / Creación
		alumnos = new Alumno[3];
		
		alumnos[0] = alumno1;
		alumnos[1] = alumno2;
		alumnos[2] = alumno3;
		
		System.out.println("La cantidad de alumnos en la lista es de : " + alumnos.length);
		
		// Composición
		Curso curso1 = new Curso(1,"Introducción al Lenguaje Java",3,profe1,alumnos);
		
		cursos = new Curso[1];
		
		cursos[0] = curso1;
		
		Universidad universidad1 = new Universidad("Universidad CaC", profesores, alumnos.length, profesores.length, alumnos, cursos);
		
		// Mostramos la universidad como objeto
		System.out.println(universidad1.toString());
	}

}
