package com.exercise1;

public class Triangulo extends Poligono {
	
	private double lado1, lado2, lado3;
	private double base1, altura1;
	
	//Constructor default
	
	public Triangulo() {
		
	}

	//Constructor Perimetro
	
	public Triangulo(int lado1, int lado2, int lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	//Constructor del Area
	
	public Triangulo(double base, double altura) {
		super(3);
		this.base1 = base;
		this.altura1 = altura;
	}
	//Encapsulacion
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getLado1() {
		return lado1;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double getLado2() {
		return lado2;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public double getLado3() {
		return lado3;
	}

	//Metodos
	@Override
	public String toString() {
		String message = "Triangulo " + super.toString() +
				"Lado 1 ="+lado1+"Lado 2= "+lado2+"Lado 3= "+lado3;
		return message;
	}
	
	@Override
	public double area() {
		return (base1 * altura1)/2;
    }
	
	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
	}


}
