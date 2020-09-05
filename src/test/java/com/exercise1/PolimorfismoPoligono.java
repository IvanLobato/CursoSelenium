package com.exercise1;

public class PolimorfismoPoligono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objeto Poligono
		Poligono poligono1 = new Rectangulo (4,4,2,2);
//llamo la clase|Nom Clase    |Nom Constructor|Valores de Constructores
		System.out.println(poligono1.toString());
		double perimetro1 = poligono1.perimetro();
		System.out.println("El perimentro de esta figura es: "+perimetro1);
		
		
		poligono1 = new Rectangulo (2,2);
		double area1 = poligono1.area();
		System.out.println("El area de esta figura es: "+area1);
	
	   //Triangulo
//		poligono1 = new Triangulo (4,3,1);
//	    System.out.println(poligono1.toString());
//        double perimetro2 = poligono1.perimetro();
//        System.out.println("El perimetro de esta figura es: "+ perimetro2);
//        
//        poligono1 = new Triangulo(5,2);
//        double area2 = poligono1.area();
//        System.out.println("El area de este poligono es: "+area2);
//        
        //Trapecio
    	poligono1 = new Trapecio (4,3,1,8);
	    System.out.println(poligono1.toString());
        double perimetro3 = poligono1.perimetro();
        System.out.println("El perimetro de esta figura es: "+ perimetro3);
        
        poligono1 = new Trapecio(5,3,6);
        double area3 = poligono1.area();
        System.out.println("El area de este poligono es: "+area3);
        
	}
	
//Ejercicio -Generar un Trapecio con sus lados, area y perimetro
}
