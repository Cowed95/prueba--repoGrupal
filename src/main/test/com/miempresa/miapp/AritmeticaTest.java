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
	
	@Test
	void testMultiplicar() {
		double resultado = Aritmetica.multiplicar(3, 3);
		assertEquals(9, resultado);
	}
	
	@Test
	void testDividir() {
		double resultado = Aritmetica.divir(10, 2);
		assertEquals(5, resultado);
	}

	
}

