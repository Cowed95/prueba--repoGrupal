package main.test.com.miempresa.miapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.com.miempresa.miapp.Aritmetica;

class AritmeticaTest {

	@Test
	void testSumar() {
		double resultado = Aritmetica.sumar(10, 5);
		assertEquals(15, resultado);
	}

	@Test
	void testResta() {
		double resultado = Aritmetica.restar(20, 6);
		assertEquals(14, resultado);
	}
	
	@Test
	void testMultiplicar() {
		double resultado = Aritmetica.multiplicar(3, 3);
		assertEquals(9, resultado);
	}
	
	@Test
	void testDividir() {
		double resultado = Aritmetica.divir(8, 2);
		assertEquals(4, resultado);
	}
	
	@Test
	void testDividirExepcion() {
		assertThrows(IllegalArgumentException.class, () -> {
			Aritmetica.divir(5, 0);
		}, "IllegalArgumentException deberia ser lanzada al dividir por 0");
	}
}
