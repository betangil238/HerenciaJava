package Exercise3;

import java.util.Scanner;

public class ElectrodomesticoService {
	Scanner leer= new Scanner(System.in);
	public Electrodomestico crearElectrodomestico() {
		
		System.out.println("ingrese el color del electrodomestico");
		String color= leer.next();
		System.out.println("Ingrese el precio del electrodomestico");
		double precio= leer.nextDouble();
		precio+=1000;
		System.out.println("Ingrese el consumo del electrodomestico");
		String consumo= leer.next();
		System.out.println("Ingrese el peso del electrodomestico");
		double peso= leer.nextDouble();
		
		Electrodomestico electrodomestico = new Electrodomestico(precio,color,consumo,peso);
		return electrodomestico;
	}	
	
	public Lavadora crearLavadora () {
		System.out.println("ingrese el color de la lavadora");
		String color= leer.next();
		System.out.println("Ingrese el precio de la lavadora");
		double precio= leer.nextDouble();
		precio+=1000;
		System.out.println("Ingrese el consumo de la lavadora");
		String consumo= leer.next();
		System.out.println("Ingrese el peso de la lavadora");
		double peso= leer.nextDouble();
		System.out.println("Ingrese la carga de la lavadora");
		double carga= leer.nextDouble();
		
		Lavadora lavadora= new Lavadora(precio,color,consumo,peso,carga);
		return lavadora;
		
	}
	
	public Televisor crearTelevisor () {
		System.out.println("ingrese el color del televisor");
		String color= leer.next();
		System.out.println("Ingrese el precio del televisor");
		double precio= leer.nextDouble();
		precio+=1000;
		System.out.println("Ingrese el consumo del televisor");
		String consumo= leer.next();
		System.out.println("Ingrese el peso del televisor");
		double peso= leer.nextDouble();
		System.out.println("Ingrese la resolucion del televisor");
		double resolucion= leer.nextDouble();
		System.out.println("tiene TDT digite 1 para SI 2 para NO");
		int opc= leer.nextInt();
		boolean TDT;
		if (opc==1) {
			TDT= true;
		}else {
			TDT= false;
		}
		
		Televisor televisor= new Televisor(precio,color,consumo,peso,resolucion,TDT);
		return televisor;	
	}
}
