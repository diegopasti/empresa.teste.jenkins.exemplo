package br.empresa.calculadora;

public class Calculadora {
	
	public Double somar(Double v1, Double v2){
		return v1+v2;
	}
	
	public Double multiplicar(Double v1, Double v2){
		return v1*v2;
	}
	
	public Double dividir(Double v1, Double v2){
		return v2!=0 ? v1/v2 : null;
	}
	
	public Double subtrair(Double v1, Double v2){
		return v1-v2;
	}
	
	public Double elevar(int base, int expoente){
		return Math.pow (base, expoente );
	}
	
	public Double raiz(Double valor){
		if(valor>0){
			return Math.sqrt(valor);	
		}
		else{
			return null;
		}		
	}
	
	public Double hipotenusa(int cateto1, int cateto2){
		return raiz((elevar(cateto1,2)+elevar(cateto2,2)));		
	}
	
}
