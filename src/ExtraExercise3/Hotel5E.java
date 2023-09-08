package ExtraExercise3;

import java.util.Scanner;

public class Hotel5E extends Hotel {
	protected String gimnasio;
	protected String nomRestaurante;
	protected int capRestaurante;
	protected int cantSalones;
	protected int cantSuites;
	protected int cantLimosinas;
	
	Scanner leer = new Scanner(System.in);
	public Hotel5E() {
		tipogimnasio();
	}
	public Hotel5E(String nombre, String dirección, String localidad, String gerente, int cantHabitaciones,
			int numCamas, int numPisos, double preciohabitacion, String nomRestaurante,
			int capRestaurante, int cantSalones, int cantSuites, int cantLimosinas) {
		super(nombre, dirección, localidad, gerente, cantHabitaciones, numCamas, numPisos, preciohabitacion);
		tipogimnasio();
		this.nomRestaurante = nomRestaurante;
		this.capRestaurante = capRestaurante;
		this.cantSalones = cantSalones;
		this.cantSuites = cantSuites;
		this.cantLimosinas = cantLimosinas;
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
	public int getCantSalones() {
		return cantSalones;
	}
	public int getCantSuites() {
		return cantSuites;
	}
	public int getCantLimosinas() {
		return cantLimosinas;
	}

	public void setNomRestaurante(String nomRestaurante) {
		this.nomRestaurante = nomRestaurante;
	}
	public void setCapRestaurante(int capRestaurante) {
		this.capRestaurante = capRestaurante;
	}
	public void setCantSalones(int cantSalones) {
		this.cantSalones = cantSalones;
	}
	public void setCantSuites(int cantSuites) {
		this.cantSuites = cantSuites;
	}
	public void setCantLimosinas(int cantLimosinas) {
		this.cantLimosinas = cantLimosinas;
	}
	
	public void tipogimnasio() {
		String tipo="";
		System.out.println("Ingrese el tipo de gimnasio A o B");
		tipo= leer.next();
		tipo= tipo.toUpperCase();
		this.gimnasio=tipo;
	}   
}
