
public class Perro extends Mascota {

	public Perro(String nombre, Boolean esMamifero, String color, String especie) {
		super(nombre, esMamifero, color, especie);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String comunicarse() {
		return "Guau";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
