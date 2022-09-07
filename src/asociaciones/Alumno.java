package asociaciones;

public class Alumno extends Persona {
	
	private int nroLegajo;

	public Alumno(int dni, String nombre, String apellido, String genero, String email, int nroLegajo) {
		super(dni, nombre, apellido, genero, email);
		this.nroLegajo = nroLegajo;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	@Override
	public String toString() {
		return "Alumno [nroLegajo=" + nroLegajo + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", genero=" + genero + ", email=" + email + "]";
	}

}
