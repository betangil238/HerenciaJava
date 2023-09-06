package ExtraExercise1;

public class Yate extends Barco{
	protected int camarotes;
	protected double potencia;

	public Yate() {
		super();
	}

	public Yate(String matricula, double eslora, int anofabrica, int  camarotes,double potencia) {
		super(matricula, eslora, anofabrica);
		this.camarotes=camarotes;
		this.potencia=potencia;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString()+
				" [camarotes=" + camarotes + ", potencia=" + potencia + "]";
	}
	
	
	
	
}
