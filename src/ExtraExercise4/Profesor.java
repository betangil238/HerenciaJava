package ExtraExercise4;

public class Profesor extends Empleado {
	protected String departamento;

	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellidos, String documento, String estadoCivil, String fechaIncorporacion,
			String despacho, String departamento) {
		super(nombre, apellidos, documento, estadoCivil, fechaIncorporacion, despacho);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
}
