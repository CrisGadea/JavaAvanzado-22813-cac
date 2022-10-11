package exceptions;

public class Main {

	public static void main(String[] args) {
		int num1, num2, div;
		num1 = 10;
		num2 = 10;
		System.out.println("Antes de ejecutar la division");
		
		try {
			div = num1 / num2;
			System.out.println("El resultado es: " + div);
			System.out.println("Despues de la ejecucion");
		} catch (Exception e) {
			e.getMessage();
		}
		
		
			}

}
