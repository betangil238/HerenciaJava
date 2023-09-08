package ExtraExercise3;

public class Hotel extends Alojamiento {
	protected int cantHabitaciones;
	protected int numCamas;
	protected int numPisos;
	protected double preciohabitacion;
	
	
	public Hotel() {
		super();
	}


	public Hotel(String nombre, String dirección, String localidad, String gerente,int cantHabitaciones, int numCamas, int numPisos, double preciohabitacion) {
		super(nombre,dirección,localidad,gerente);
		this.cantHabitaciones = cantHabitaciones;
		this.numCamas = numCamas;
		this.numPisos = numPisos;
		this.preciohabitacion = preciohabitacion;
	}


	public int getCantHabitaciones() {
		return cantHabitaciones;
	}


	public int getNumCamas() {
		return numCamas;
	}


	public int getNumPisos() {
		return numPisos;
	}


	public double getPreciohabitacion() {
		return preciohabitacion;
	}


	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}


	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}


	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}


	public void setPreciohabitacion(double preciohabitacion) {
		this.preciohabitacion = preciohabitacion;
	}
	
}
