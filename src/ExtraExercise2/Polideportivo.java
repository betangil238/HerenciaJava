package ExtraExercise2;

import java.util.Scanner;

public class Polideportivo extends Edificio {
	
	protected String nombre;
	protected String instalacion;
	private String[] techo= {"Techado","Abierto"};
	Scanner leer= new Scanner(System.in);
	public Polideportivo() {
		super();
		verificartecho();
	}
	public Polideportivo(double ancho, double alto, double largo,String nombre) {
		super(ancho, alto, largo);
		verificartecho();
	}
	
	private void verificartecho() {
		int opcion=0;
		do {
			System.out.println("Seleccione 1 para techo Techado o 2 para techo Abierto");
			opcion=leer.nextInt();
		}while(opcion<1 || opcion>2);
		instalacion=(opcion==1) ?  techo[0]:techo[1];
	}
	public String getNombre() {
		return nombre;
	}
	public String getInstalacion() {
		return instalacion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void calcularSuperficie() {
		// TODO Auto-generated method stub
		super.calcularSuperficie();
	}
	@Override
	public void calcularVolumen() {
		// TODO Auto-generated method stub
		super.calcularVolumen();
	}
	
	
}
