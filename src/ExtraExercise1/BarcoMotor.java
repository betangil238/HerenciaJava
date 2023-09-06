package ExtraExercise1;

public class BarcoMotor extends Barco {
	protected double potencia;

	public BarcoMotor() {
		super();
	}

	public BarcoMotor(String matricula, double eslora, int anofabrica, double potencia) {
		super(matricula, eslora, anofabrica);
		this.potencia=potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString()+ " [potencia=" + potencia + "]";
	}
	
	
	
	
}
