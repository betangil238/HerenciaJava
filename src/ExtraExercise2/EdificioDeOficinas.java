package ExtraExercise2;

public class EdificioDeOficinas extends Edificio {
	protected int numOficina;
	protected int cantPersonas;
	protected int numPisos;
	
	public EdificioDeOficinas() {
		super();
	}

	public EdificioDeOficinas(double ancho, double alto, double largo,int numOficina, int cantPersonas, int numPisos) {
		super(ancho,alto,largo);
		this.numOficina = numOficina;
		this.cantPersonas = cantPersonas;
		this.numPisos = numPisos;
	}
	
	public int getNumOficina() {
		return numOficina;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumOficina(int numOficina) {
		this.numOficina = numOficina;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}
	
	public void cantPersonas() {
		if (numOficina==0 || cantPersonas==0) {
			System.out.println("Lo sentimos, no podemos calcular debido a que falta informacion");
		}else {
			System.out.println("La cantidad de personas por piso es: "+(numOficina*cantPersonas));
			if (numPisos==0) {
				
			}else {
				System.out.println("La cantidad de personas en el edificio es: "+(numOficina*cantPersonas*numPisos));
			}
		}
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
