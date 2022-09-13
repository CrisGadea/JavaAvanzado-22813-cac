
public class Gato extends Mascota {

	public Gato(String nombre, Boolean esMamifero, String color, String especie) {
		super(nombre, esMamifero, color, especie);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String comunicarse() {
		return "Miau";
	}
	
	public String jugar() {
		return "Miaaauuu estoy jugando";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}

}
