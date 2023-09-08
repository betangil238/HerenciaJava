package ExtraExercise4;

public class perServicio extends Empleado {
	protected String seccion;

	public perServicio(String nombre, String apellidos, String documento, String estadoCivil, String fechaIncorporacion,
			String despacho, String seccion) {
		super(nombre, apellidos, documento, estadoCivil, fechaIncorporacion, despacho);
		this.seccion = seccion;
	}

	public perServicio() {
		super();
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
}
