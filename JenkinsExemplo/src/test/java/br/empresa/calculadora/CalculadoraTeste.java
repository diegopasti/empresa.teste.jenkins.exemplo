package br.empresa.calculadora;

import junit.framework.TestCase;

public class CalculadoraTeste extends TestCase {
	
	private Calculadora calc;
	
	public CalculadoraTeste(){
		calc = new Calculadora();
	}

	public void testSomar() {
		assertEquals(10.0, calc.somar(5.0, 5.0), 0.00001); 
	}

	public void testMultiplicar() {
		assertEquals(25.0, calc.multiplicar(5.0, 5.0), 0.00001);
	}

	public void testDividir() {
		assertEquals(1.0, calc.dividir(5.0, 5.0), 0.00001);
	}
	
	public void testDividirPorZero() {
		assertNull(calc.dividir(5.0, 0.0));
	}

	public void testSubtrair() {
		assertEquals(0.0, calc.subtrair(5.0, 5.0), 0.00001);
	}

}
