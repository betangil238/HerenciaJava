package ExtraExercise1;

public class Barco {
	protected String matricula;
	protected double eslora;
	protected int anofabrica;
	
	public Barco() {
		super();
	}
	public Barco(String matricula, double eslora, int anofabrica) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anofabrica = anofabrica;
	}
	public String getMatricula() {
		return matricula;
	}
	public double getEslora() {
		return eslora;
	}
	public int getAnofabrica() {
		return anofabrica;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public void setAnofabrica(int anofabrica) {
		this.anofabrica = anofabrica;
	}
	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anofabrica=" + anofabrica + "]";
	}
	
	

}
