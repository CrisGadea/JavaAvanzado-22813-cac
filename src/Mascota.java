
public abstract class Mascota {

	private String nombre, color, especie;
	private Boolean esMamifero;
	
	public Mascota(String nombre, Boolean esMamifero, String color, String especie) {
		this.nombre = nombre;
		this.esMamifero = esMamifero;
		this.color = color;
		this.especie = especie;
	}
	
	/**
	 * Metodo abstracto: Unicamente colocamos la firma del metodo
	 * dejando que las clases hijas sobreescriban su funcionalidad.
	 * @return String
	 */
	public abstract String comunicarse();
	
	public abstract String comer();

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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Boolean getEsMamifero() {
		return esMamifero;
	}

	public void setEsMamifero(Boolean esMamifero) {
		this.esMamifero = esMamifero;
	}
	
	
	
}
