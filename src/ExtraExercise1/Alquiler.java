package ExtraExercise1;

import java.util.Date;

public class Alquiler {
	protected String nombre;
	protected String documento;
	protected Date fechaAlquiler;
	protected Date fechaDevolucion;
	protected int posAmarre;
	protected Barco barco;
	
	
	public Alquiler() {
		super();
	}


	public Alquiler(String nombre, String documento, Date fechaAlquiler, Date fechaDevolucion, int posAmarre,
			Barco barco) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
		this.posAmarre = posAmarre;
		this.barco = barco;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDocumento() {
		return documento;
	}


	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}


	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}


	public int getPosAmarre() {
		return posAmarre;
	}


	public Barco getBarco() {
		return barco;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}


	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	public void setPosAmarre(int posAmarre) {
		this.posAmarre = posAmarre;
	}


	public void setBarco(Barco barco) {
		this.barco = barco;
	}


	@Override
	public String toString() {
		return "Alquiler [nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler
				+ ", fechaDevolucion=" + fechaDevolucion + ", posAmarre=" + posAmarre + ", barco=" + barco + "]";
	}
	
	
	
}
