package Matrices;

public class Main {

	public static void main(String[] args) {
		final int FILAS = 2;
		final int COLUMNAS = 2;
		/*
		int [][] numeros = new int[FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++) {
			
		} */
		// Creamos un array bidimensional "Harckodeado"
		int [][] numeros = {{1,2},{3,4}};
		
		// Creamos otra matriz sin dar valores default al inicio
		int [][] numeros2 = new int [FILAS][COLUMNAS];
		
		// Array unidimensional
		int [] numerosArr = new int [3];
		
		// Recorremos un array unidimensional vacío (Se le agregan valores por default)
		for (int i = 0; i < numerosArr.length; i++) {
			System.out.println(numerosArr[i]);
		}
		
		// For Anidado (un for dentro de otro for)
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				numeros2[i][j] = 1;
			}	
		}
		
		// Recorrer el array
		for (int i = 0; i < numeros2.length; i++) {
			for (int j = 0; j < numeros2.length; j++) {
				System.out.println("En la posicion [" + i + "][" + j + "] tenemos el número: " + numeros2[i][j]);
			}
		}
		
	}

}
