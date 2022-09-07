package asociaciones;

public class Profesor extends Persona {

	private int nroMatricula;
	
	public Profesor(int dni, String nombre, String apellido, String genero, String email, int nroMatricula) {
		super(dni, nombre, apellido, genero, email);
		this.nroMatricula = nroMatricula;
	}

	public int getNroMatricula() {
		return nroMatricula;
	}

	public void setNroMatricula(int nroMatricula) {
		this.nroMatricula = nroMatricula;
	}

	@Override
	public String toString() {
		return "Profesor [nroMatricula=" + nroMatricula + ", dni=" + dni + ", nombre=" + nombre + ", apellido="
				+ apellido + ", genero=" + genero + ", email=" + email + "]";
	}
	
}
