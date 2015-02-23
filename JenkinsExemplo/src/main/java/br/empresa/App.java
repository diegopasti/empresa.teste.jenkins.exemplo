package br.empresa;

import br.empresa.calculadora.Calculadora;

public class App {
    public static void main( String[] args ){
    	Calculadora calc = new Calculadora();
    	System.out.println("Testando"+calc.toString());
    	System.out.println("Testando"+calc.toString());
    	System.out.println("Testando"+calc.toString());
    	System.out.println("Testando"+calc.toString());
    	System.out.println("Testando"+calc.toString());
    	System.out.println("Testando"+calc.toString());
    	System.out.println("Testando"+calc.toString());
    }
    
    public void Calcular(){
    	int g = 0,k=0,i=0;
    	
    	while(g<100){
    		while(k<100){
    			while(i<100){
    				i++;
    			}
    			k++;
    		}
    		g++;
    	}    	
    }
}
