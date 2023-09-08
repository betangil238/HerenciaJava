package ExtraExercise3;

public class Alojamiento {
	protected String nombre;
	protected String dirección;
	protected String localidad;
	protected String gerente;
	
	
	public Alojamiento() {
		super();
	}


	public Alojamiento(String nombre, String dirección, String localidad, String gerente) {
		super();
		this.nombre = nombre;
		this.dirección = dirección;
		this.localidad = localidad;
		this.gerente = gerente;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDirección() {
		return dirección;
	}


	public String getLocalidad() {
		return localidad;
	}


	public String getGerente() {
		return gerente;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setDirección(String dirección) {
		this.dirección = dirección;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public void setGerente(String gerente) {
		this.gerente = gerente;
	}


}
