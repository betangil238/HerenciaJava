package Exercise4;

public class mainFiguras {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(10);
		double areacirculo=circulo.area();
		double perimetrocirculo=circulo.perimetro();
		System.out.println("El area del circulo es: "+ areacirculo+ " el perimetro del circulo es: "+ perimetrocirculo);
		Circulo circulo1= new Circulo();
		System.out.println(circulo1.area());
		Rectangulo rectangulo = new Rectangulo(5, 4);
		double arearectangulo=rectangulo.area();
		double perimetrorectangulo=rectangulo.perimetro();
		System.out.println("El area del rectangulo es: "+ arearectangulo+ " el perimetro del rectangulo es: "+ perimetrorectangulo);
		Rectangulo rectangulo1 = new Rectangulo();
		System.out.println(rectangulo1.perimetro());
	}

}
