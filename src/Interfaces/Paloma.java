package Interfaces;

public class Paloma {

	protected String nombre;
	protected String color;
	
	public Paloma(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Paloma [nombre=" + nombre + ", color=" + color + "]";
	}
	
	
	
}
