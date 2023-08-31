package Exercise1;

public class Animal {
	protected String nombre;
	protected String alimento;
	protected int edad;
	protected String raza;
	public Animal(String nombre, String alimento, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.alimento = alimento;
		this.edad = edad;
		this.raza = raza;
	}
	
	public void Alimentarse() {
		System.out.println("La mascota "+ nombre + " se alimenta de: "+alimento);
	}

}
