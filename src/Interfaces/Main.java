package Interfaces;

import asociaciones.Alumno;
import asociaciones.Profesor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1 = new Alumno(5555555, "Johny", "Doe", "Masculino", "johny@doe.com", 1);
		Profesor profesor1 = new Profesor(2222222, "Cleo", "Doe", "No Binario", "cleo@doe.com", 2);
		PalomaMensajera palomita = new PalomaMensajera("lola", "blanco");
		String mensaje1 = "Hola profe, aguante Java!";
		Celular celu1 = new Celular("Samsung","S8","Gris",1122334455);
		
		alumno1.escribirMensaje(celu1,mensaje1);
		celu1.enviarMensajeA(profesor1);
		System.out.println("El mensaje recibido por el Profesor es: " + profesor1.getMensaje());
		
		String respuesta = "Hola Alumno, estoy de acuerdo, Java es lo mejor!";
		profesor1.escribirMensaje(palomita, respuesta);
		palomita.enviarMensajeA(alumno1);
		
		System.out.println("El mensaje recibido por el Alumno es: " + alumno1.getMensaje());
		
	}

}
