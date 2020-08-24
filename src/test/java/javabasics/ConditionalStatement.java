package javabasics;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int velocidad = 60;
	int limitedevelocidad = 70;
	
	//IF 
//	if (velocidad > limitedevelocidad) {
//		System.out.println("Multa!!!");	
//	}
	//IF Else
//	if (velocidad > limitedevelocidad) {
//		System.out.println("Multa!!");
//	}else {
//		System.out.println("Vamos a una velocidad adecuada");
//	}

	//IF Anidados
//	boolean highway = true;
//	
//	if(highway == true) {
//	
//	     System.out.println("Vamos en la highway");
//	     
//	     limitedevelocidad = 100;
//	     
//	     if (velocidad > limitedevelocidad) {
//	        System.out.println("Multa!!");
//	}else {
//		    System.out.println("Vamos a una velociada adecuada");
//	}
//	}

	//IF ELSE IF
//	boolean highway = false;
//	
//	if(highway == true) {
//	
//	     System.out.println("Vamos en la highway");
//	     
//	     limitedevelocidad = 100;
//	     
//	     if (velocidad > limitedevelocidad) {
//	        System.out.println("Multa!!");
//	}else {
//		    System.out.println("Vamos a una velociada adecuada");
//	}
//	}else if(velocidad > limitedevelocidad) {
//		System.out.println("Vas en un calle a exceso de velocidad Multa !!");
//	}else {
//		System.out.println("Vas en una calle a una velocidad adecuada");
//	}
//
	//SWITCH CASE
	int temperatura = 22;
	
	switch (temperatura) {
	case 10:
		System.out.println("Frio");
		break; //Salir del programa o del case
		
	case 20:
		System.out.println("Agradable");
		break;
		
	case 30:
		System.out.println("Calor");
		break;
		
	case 40:
		System.out.println("Estamos en el desierto");
		break;
		
	default:
		System.out.println("Da igual");
		break;
	}

	}

}
