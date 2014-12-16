package br.empresa.calculadora;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
	
	private Calculadora calc;
	
	public CalculadoraTest(){
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
	
	public void testElevar(){
		assertEquals(8, calc.elevar(2, 3), 0);
	}
	
	public void testElevarZero(){
		assertEquals(1, calc.elevar(2, 0), 0);
	}
	
	public void testRaiz(){
		assertEquals(2.0, calc.raiz(4.0), 0);
	}
	
	public void testRaizNegativa(){
		assertNull(calc.raiz(-4.0));
	}
	
	public void testHipotenusa(){
		assertEquals(5.0, calc.hipotenusa(3,4));
	}
	
	public void testLogaritimo(){
	}

}
