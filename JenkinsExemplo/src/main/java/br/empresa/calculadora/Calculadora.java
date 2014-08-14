package br.empresa.calculadora;

public class Calculadora {
	
	public Double somar(Double v1, Double v2){
		return v1+v2;
	}
	
	public Double multiplicar(Double v1, Double v2){
		return v1*v2;
	}
	
	public Double dividir(Double v1, Double v2){
		if(v2!=0) return v1/v2;
		else return null;
	}
	
	public Double subtrair(Double v1, Double v2){
		return v1-v2;
	}
	

}
