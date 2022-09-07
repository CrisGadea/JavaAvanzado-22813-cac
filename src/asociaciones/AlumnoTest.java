package asociaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AlumnoTest {
	
	@Test
	void testQuePruebaQuePuedoObtenerElNumeroDeLegajoDeUnAlumno() {
		// 3 Pasos a seguir:
		
		// 1) Generar los recursos necesarios para hacer las pruebas
		Alumno alumno1 = new Alumno(111, "John", "Doe", "No Binario", "johndoe@mail.com", 1);
		int nroLegajoEsperado = 1;
		// 2) Ejecutamos el método de prueba
		int nroLegajoObtenido = alumno1.getNroLegajo();
		// 3) Realizamos las comprobaciones con asserts
		Assert.assertEquals(nroLegajoEsperado, nroLegajoObtenido);
		
	}
	
	@Test
	void testQuePruebaQueAlNoObtenerElNroDeLegajoCorrectoPasaAlgo() {
		
	}

}
