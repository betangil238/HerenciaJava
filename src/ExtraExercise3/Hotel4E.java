package ExtraExercise3;

import java.util.Scanner;

public class Hotel4E extends Hotel {
	protected String gimnasio;
	protected String nomRestaurante;
	protected int capRestaurante;
	
	Scanner leer = new Scanner(System.in);
	public Hotel4E() {
		tipogimnasio();
	}


	public Hotel4E(String nombre, String dirección, String localidad, String gerente, int cantHabitaciones,
			int numCamas, int numPisos, double preciohabitacion, String nomRestaurante,
			int capRestaurante) {
		super(nombre, dirección, localidad, gerente, cantHabitaciones, numCamas, numPisos, preciohabitacion);
		tipogimnasio();
		this.nomRestaurante = nomRestaurante;
		this.capRestaurante = capRestaurante;
	}


	public String getGimnasio() {
		return gimnasio;
	}


	public String getNomRestaurante() {
		return nomRestaurante;
	}


	public int getCapRestaurante() {
		return capRestaurante;
	}


	public void setNomRestaurante(String nomRestaurante) {
		this.nomRestaurante = nomRestaurante;
	}


	public void setCapRestaurante(int capRestaurante) {
		this.capRestaurante = capRestaurante;
	}
	
	public void tipogimnasio() {
		String tipo="";
		System.out.println("Ingrese el tipo de gimnasio A o B");
		tipo= leer.next();
		tipo= tipo.toUpperCase();
		this.gimnasio=tipo;
	}  
}
