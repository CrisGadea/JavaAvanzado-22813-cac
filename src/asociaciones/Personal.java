package asociaciones;

public class Personal extends Persona {
	
	private int legajoPersonal;

	public Personal(int dni, String nombre, String apellido, String genero, String email, int legajoPersonal) {
		super(dni, nombre, apellido, genero, email);
		this.legajoPersonal = legajoPersonal;
		// TODO Auto-generated constructor stub
	}
	
	public int getLegajoPersonal() {
		return legajoPersonal;
	}
	
	public void setLegajoPersonal(int legajoPersonal) {
		this.legajoPersonal = legajoPersonal;
	}

}
