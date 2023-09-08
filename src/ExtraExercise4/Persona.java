package ExtraExercise4;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected String documento;
	protected String estadoCivil;
	
	
	public Persona() {
		super();
	}


	public Persona(String nombre, String apellidos, String documento, String estadoCivil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.documento = documento;
		this.estadoCivil = estadoCivil;
	}


	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}


	public String getDocumento() {
		return documento;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
