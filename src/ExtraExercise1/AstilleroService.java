package ExtraExercise1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AstilleroService {
	Scanner leer = new Scanner(System.in);
	ArrayList<Alquiler> alquileres = new ArrayList<>();
	ArrayList<Barco> barcos= new ArrayList<>();
	
	public void menu() {
		precarga();
		int key=9;
		while(key!=0) {
			System.out.println("BIENVENIDO AL MENU");
			System.out.println("1) Crear Alquiler");
			System.out.println("2) Crear Velero");
			System.out.println("3) Crear Yate");
			System.out.println("4) Crear Barco a Motor");
			System.out.println("5) Crear Barco comun");
			System.out.println("6) Mostrar Barcos");
			System.out.println("7) Mostrar Alquileres");
			System.out.println("8) Mostrar Precio final alquiler");
			System.out.println("0) Salir");
			System.out.print("Ingrese la opcion que desea: ");
			key=leer.nextInt();
			switch (key) {
			case 1:
				crearAlquiler();
				break;
			case 2:
				crearVelero();
				break;
			case 3:
				crearYate();
				break;
			case 4:
				crearBarcoaMotor();
				break;
			case 5:
				crearBarcoComun();
				break;
			case 6:
				mostrarBarcos();
				break;
			case 7:
				mostrarAlquileres();
				break;
			case 8:
				mostrarPrecio();
				break;
			case 0:
				System.out.println("Muchas gracias");;
				break;
			default:
				System.out.println("Dato incorrecto");
				break;
			}
		}
	}
	private void mostrarPrecio() {
		int opcion =0;
		if(alquileres.size()==0) {
			System.out.println("No hay alquileres para mostrar");
		}else {
			System.out.println("Cual alquiler desea consultar");
			mostrarAlquileres();
			do {
				opcion = leer.nextInt();
			}while(opcion<0 || opcion>=alquileres.size());
			
			double precio=calcularprecio(alquileres.get(opcion));
			System.out.println("El precio de la reserva es: "+ precio);
		}
		
		
		
	}
	private void precarga() {
		barcos.add(new Yate("Y1", 12.5, 1980, 200, 1800));
		barcos.add(new Yate("Y2", 22.5, 2015, 3, 450.5));
		barcos.add(new Yate("Y3", 25.0, 2018, 4, 550.0));
		barcos.add(new Yate("Y4", 30.2, 2020, 5, 700.3));
		barcos.add(new  Barco("B1", 18.2, 2017));
		barcos.add(new Barco("B2", 15.8, 2019));
		barcos.add(new BarcoMotor("BM1", 20.5, 2018, 350.0));
		barcos.add(new BarcoMotor("BM2", 24.0, 2020, 500.0));
		barcos.add(new Velero("V1", 18.5, 2017, 1));
		barcos.add(new Velero("V2", 22.0, 2019, 2));
	}
	
	private void crearBarcoaMotor() {
		System.out.println("Ingrese la matricula del barco");
		String matricula=leer.next();
		System.out.println("Ingrese la longitud(eslora) del barco");
		double eslora=leer.nextDouble();
		System.out.println("Ingrese el ano del barco");
		int anofabrica=leer.nextInt();
		System.out.println("Ingrese la potencia del barco");
		double potencia=leer.nextDouble();
		BarcoMotor barcoM= new BarcoMotor(matricula, eslora, anofabrica, potencia);
		barcos.add(barcoM);
	}

	private void crearYate() {
		System.out.println("Ingrese la matricula del barco");
		String matricula=leer.next();
		System.out.println("Ingrese la longitud(eslora) del barco");
		double eslora=leer.nextDouble();
		System.out.println("Ingrese el ano del barco");
		int anofabrica=leer.nextInt();
		System.out.println("Ingrese el numero de camarotes del yate");
		int camarotes=leer.nextInt();
		System.out.println("Ingrese la potencia del yate");
		double potencia=leer.nextDouble();
		Yate yate = new Yate(matricula, eslora, anofabrica, camarotes, potencia);
		barcos.add(yate);
	}

	private void crearVelero() {
		System.out.println("Ingrese la matricula del barco");
		String matricula=leer.next();
		System.out.println("Ingrese la longitud(eslora) del barco");
		double eslora=leer.nextDouble();
		System.out.println("Ingrese el ano del barco");
		int anofabrica=leer.nextInt();
		System.out.println("Ingrese el numero de mastiles del velero");
		int mastiles=leer.nextInt();
		Velero velero = new Velero(matricula, eslora, anofabrica, mastiles);
		barcos.add(velero);
	}

	private void crearBarcoComun() {
		System.out.println("Ingrese la matricula del barco");
		String matricula=leer.next();
		System.out.println("Ingrese la longitud(eslora) del barco");
		double eslora=leer.nextDouble();
		System.out.println("Ingrese el ano del barco");
		int anofabrica=leer.nextInt();
		Barco barco= new Barco(matricula, eslora, anofabrica);
		barcos.add(barco);
		
	}

	private void crearAlquiler() {
		int opc=0;
		System.out.println("Ingrese nombre");
		String nombre= leer.next();
		System.out.println("Ingrese documento");
		String documento=leer.next();
		Date fechaAlquiler=new Date();
		System.out.println("Ingrese dia de devolucion");
		int dia = leer.nextInt();
		System.out.println("Ingrese mes de devolucion");
		int mes = leer.nextInt();
		System.out.println("Ingrese ano de devolucion");
		int ano = leer.nextInt();
		Date fechaDevolucion= new Date(ano-1900, mes-1, dia);
		System.out.println("Ingrese el numero de pos amarre");
		int posAmarre=leer.nextInt();
		System.out.println("ESTOS SON LOS BARCOS, SELECCIONE UNO");
		mostrarBarcos();
		do {
			opc=leer.nextInt();
		}while (opc <0 || opc >=barcos.size());
		Barco barco = barcos.get(opc);
		Alquiler alquiler= new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, posAmarre, barco);
		alquileres.add(alquiler);
		double precio=calcularprecio(alquiler);
		System.out.println("El precio de la reserva es: "+ precio);
	}

	private double calcularprecio(Alquiler alquiler) {
		double precio=0;
		int anos = (alquiler.getFechaDevolucion().getYear()-alquiler.getFechaAlquiler().getYear())*365;
		int meses= (alquiler.getFechaDevolucion().getMonth()-alquiler.getFechaAlquiler().getMonth())*30;
		int dias= (alquiler.getFechaDevolucion().getDate()-alquiler.getFechaAlquiler().getDate());
		precio=(anos+meses+dias)*alquiler.getBarco().getEslora()*10;
		if (alquiler.getBarco() instanceof Velero) {
			precio+=((Velero) alquiler.getBarco()).getNumMastil();
		}else if(alquiler.getBarco() instanceof Yate) {
			precio+=((Yate) alquiler.getBarco()).getCamarotes()+((Yate) alquiler.getBarco()).getPotencia();
		}else if (alquiler.getBarco() instanceof BarcoMotor) {
			precio+=((BarcoMotor) alquiler.getBarco()).getPotencia();
		}
		return precio;
	}
	private void mostrarBarcos() {
		int counter=0;
		for (Barco barco: barcos) {
			System.out.println(counter+") "+barco);
			counter++;
		}
	}
	
	private void mostrarAlquileres() {
		int counter=0;
		for (Alquiler alquiler: alquileres) {
			System.out.println(counter+") "+alquiler);
			counter++;
		}
	}
}
