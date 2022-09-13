package asociaciones;

import Interfaces.Comunicable;

public class Persona {
	
	protected int dni;
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected String email;
	protected String mensaje;
	
	public Persona(int dni, String nombre, String apellido, String genero, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.email = email;
		this.mensaje = "";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getMensaje() {
		return mensaje;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", genero=" + genero + ", email=" + email + "]";
	}

	public void recibirMensaje(String mensaje) {
		// TODO Auto-generated method stub
		this.mensaje= mensaje;
	}
	
	public void escribirMensaje(Comunicable obj, String mensaje) {
		this.mensaje = mensaje;
		obj.recibirMensaje(mensaje);
	}	
	
}
