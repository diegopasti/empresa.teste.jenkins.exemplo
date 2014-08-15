package br.empresa;

import br.empresa.calculadora.Calculadora;

public class App {
    public static void main( String[] args ){
    	Calculadora calc = new Calculadora();
    	System.out.println(calc.somar(2.0, 2.0));
    }
}
