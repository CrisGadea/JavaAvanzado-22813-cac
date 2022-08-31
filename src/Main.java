
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String nombre = "Cristian"; // En Java los String son inmutables
		final String FECHA_NAC = "18/12/1996";
		
		System.out.println(saludar(nombre));
		
		Auto auto1 = new Auto("Cronos","Rojo","AAAFF2342");
		auto1.setAnio(2023);
		Auto auto2 = new Auto("Cronos","Blanco","AABFG2343", 2022, false);
		
		System.out.println("El color del auto 1 es: " + auto1.getColor());
		System.out.println("El año del auto 2 es: " + auto2.getAnio());
		System.out.println("El año del auto 1 es: " + auto1.getAnio());
		*/
		Gato gatito = new Gato("Cleo",true,"negro","normal");
		Perro perrito = new Perro("Felix",true,"blanco", "caniche");
		// No podemos usar los metodos del Gato en una instancia creada como Mascota
		Mascota robert = new Gato("Robert",true,"marron","felino");
		
		System.out.println(gatito.comunicarse());
		System.out.println(perrito.comunicarse());
		System.out.println(robert.comunicarse());
		System.out.println(gatito.jugar());
		
		
	}
	
	public static String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
