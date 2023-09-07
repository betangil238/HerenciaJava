package ExtraExercise2;

import java.util.Base64;

public class Edificio {
	protected double ancho;
	protected double alto;
	protected double largo;
	
	
	public Edificio() {
		super();
	}


	public Edificio(double ancho, double alto, double largo) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}


	public double getAncho() {
		return ancho;
	}


	public double getAlto() {
		return alto;
	}


	public double getLargo() {
		return largo;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public void calcularSuperficie() {
		System.out.println("El area de la superficie es: "+ (ancho*largo));
	}
	
	public void calcularVolumen() {
		System.out.println("El volumen de la superficie es: "+ (ancho*largo*alto));
	}


}
