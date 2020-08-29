package com.exercise1;

public abstract class Poligono {
	
	private int numLados;
	
	//Constructor default
	public Poligono () {
		
	}
	
	//Constructor 2 Lados
	public Poligono (int numLados) {
		this.numLados = numLados;		
	}
	
	//Encapsular Setter y Getter
	public void setNumLados (int numLados) {
		this.numLados = numLados;
	}
	
	public int getNumLados() {
		return numLados;
	}
	
	// imprimir numero de lados
	@Override //esto significa que el metodo puede cambiar
	public String toString () {
		return "Numero de Lados: "+ numLados;
	}
	
	//Metodos de Abtracción
	public abstract double area();
	public abstract double perimetro();
}
