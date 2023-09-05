package Exercise4;

public class Rectangulo implements calculosFormas {
	
	private double base;
	private double altura;
	
	
	public Rectangulo() {
		super();
	}


	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public double getAltura() {
		return altura;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public double perimetro() {
		if(altura==0 || base==0) {
			System.out.println("Ingrese los atributos del rectangulo");
			return 0;
		}
		return (base + altura) * 2;
	}


	@Override
	public double area() {
		if(altura==0 || base==0) {
			System.out.println("Ingrese los atributos del rectangulo");
			return 0;
		}
		return base * altura;
	}
	
	
	
	

}
