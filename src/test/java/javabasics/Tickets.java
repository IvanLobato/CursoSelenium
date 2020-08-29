package javabasics;

    
public class Tickets {
	
	int precioAdulto , edad;
	double precioNi�o, precioEstudiante;
	boolean estudiante = false;
	String costo;
	int descuento = 30;
	//double descuento;
	//boolean diaDescuento = false;
	
	//-------------------Constructor
	public Tickets (int precioNormal, int edadPersona, boolean credencialEstudiante, boolean rebaja) {
		
		precioAdulto = precioNormal - descuento;
		precioNi�o = precioNormal * (.85);
		precioEstudiante = precioNormal *(.5);
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
		//descuento = precioNormal * (.5);
		//diaDescuento = rebaja;
		
	}
	//-----------------------Metodos
	
    public void costoDia () {
    	System.out.println("El costo del ticket: "+ costo);
    }
       public void descuento () {
        System.out.println("El costo del ticket, Dia Descuento: $"+ descuento);
    }	
    public void precioAdulto ( ) {
    	System.out.println("Ticket Adulto: $"+ precioAdulto);
    }
    
    public void precioNi�o () {
    	System.out.println("Ticket Ni�o: $"+ precioNi�o);
    }
   
    public void precioEstudiante () {
    	System.out.println("Ticket Estudiante: $"+ precioEstudiante);
    }
    
    public void verificacioncostoTicket ( ) {
    	if (estudiante==true) {
    		System.out.println("Eres un estudiante, el precio del ticket es: $"+ precioEstudiante);
    	}else if (edad>18) {
    		System.out.println("Eres un adulto, el precio del ticket es: $"+precioAdulto);
    	}else {
    		System.out.println("Eres un ni�o, el precio del ticket es: $"+ precioNi�o);
    	}
   
    }
    
//    public void verificacionOferta ( ) {
//    	if (diaDescuento==true) {    		
//    	   System.out.println("Es un dia de Oferta en la compra del boleto, el precio del ticket es: $" + precioEstudiante);
//    	} else {
//    		System.out.println("Hoy no es un dia de oferta, El precio del ticket es: $100");
//    	}
//    }

  /***************************************SOBRECARGA DE METODO*/
  
    public double sumarTicket() {
    	double suma = (precioAdulto + precioNi�o);
    	System.out.println(suma);
    	return suma;
    }
    
    public double sumarTicket(int descuento) {
    	double suma = (precioAdulto + precioNi�o) - descuento;
    	System.out.println(suma);
    	return suma;
    }
    public double sumarTicket(int descuento, int descuentoExtra) {
    	double suma = (precioAdulto + precioNi�o) - descuento - descuentoExtra;
    	System.out.println(suma);
    	return suma;
    }
    
    //EJERCICIO GENERAR OTRO  CONSTRUCTOR  CON ARGUMENTO "DESCUENTO"
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Objeto Tickets
		Tickets tickets = new Tickets(100,19,true,false);
		
		tickets.costoDia();
		//tickets.descuento();
		tickets.precioAdulto();
		tickets.precioNi�o();
		tickets.precioEstudiante();		
		//tickets.verificacionOferta();

		tickets.sumarTicket (20, 50);
	}

}
