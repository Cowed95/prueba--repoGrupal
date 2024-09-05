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
	void testRestar() {
		double resultado = Aritmetica.restar(10, 5);
		assertEquals(5, resultado);
	}

}
