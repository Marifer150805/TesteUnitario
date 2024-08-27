package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName(" Teste 5 + 5 = 10")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 5 + 5 não gerou o valor 10");
		
	}
	@Test
	@DisplayName(" Teste 10 - 5 = 5")
	void testSub() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 10D;
		double valor2 = 5D;
		double esperado = 5D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 5 - 5 não gerou o valor 5");
		
	}
	@Test
	@DisplayName(" Teste 15 * 5 = 75")
	void testMult() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 15D;
		double valor2 = 5D;
		double esperado = 75D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 5 * 5 não gerou o valor 75");
		
	}
	@Test
	@DisplayName(" Teste 30 / 5 = 6")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 30D;
		double valor2 = 5D;
		double esperado = 6D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, " 5 / 5 não gerou o valor 6");
		
	}

}
