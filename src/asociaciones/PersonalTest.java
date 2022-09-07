package asociaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PersonalTest {

	@Test
	void testQuePruebaQuePuedoObtenerElLegajoDelPersonalSolicitado() {
		// 1) given - 2) when - 3) then
		// 1) Creamos los objetos
		Personal personal1 = new Personal(222, "Juan", "Doe", "Masculino", "juandoe@mail.com", 1);
		String nombreEsperado = "Juan";
		int legajoPersonalEsperado = 1;
		// 2) Ejecutamos el metodo a probar
		String nombreObtenido = personal1.getNombre();
		int legajoPersonalObtenido = personal1.getLegajoPersonal();
		// 3) Validamos los asserts
		Assert.assertEquals(nombreEsperado, nombreObtenido);
		Assert.assertEquals(legajoPersonalEsperado, legajoPersonalObtenido);
	}
	
	@Test
	void testQuePruebaQuePuedoModificarElNumeroDeLegajoDelPersonal() {
		// 1) Creamos los objetos
				Personal personal1 = new Personal(222, "Juan", "Doe", "Masculino", "juandoe@mail.com", 1);
				// 2) Ejecutamos el metodo a probar
				int legajoPersonalEsperado = 3;
				personal1.setLegajoPersonal(3);
				int legajoPersonalObtenido = personal1.getLegajoPersonal();
				// 3) Validamos los asserts
				Assert.assertEquals(legajoPersonalEsperado, legajoPersonalObtenido);
	}
}
