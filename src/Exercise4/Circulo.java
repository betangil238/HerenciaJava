package Exercise4;

public class Circulo implements calculosFormas {
	
	private double radio;
	
	public Circulo() {
		super();
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		if (radio==0) {
			System.out.println("Ingrese los atributos del triangulo");
			return 0;
		}
		return PI*2*radio;
	}

	@Override
	public double area() {
		if (radio==0) {
			System.out.println("Ingrese los atributos del circulo");
			return 0;
		}
		return PI*radio*radio;
	}
	

}
