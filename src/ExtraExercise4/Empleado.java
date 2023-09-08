package ExtraExercise4;

public class Empleado extends Persona {
	protected String fechaIncorporacion ;
	protected String despacho;
	
	
	public Empleado() {
		super();
	}


	public Empleado(String nombre, String apellidos, String documento, String estadoCivil, String fechaIncorporacion,
			String despacho) {
		super(nombre, apellidos, documento, estadoCivil);
		this.fechaIncorporacion = fechaIncorporacion;
		this.despacho = despacho;
	}


	public String getFechaIncorporacion() {
		return fechaIncorporacion;
	}


	public String getDespacho() {
		return despacho;
	}


	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}


	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	
}
