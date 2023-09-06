package Exercise4;

public class mainFiguras {
//	Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
//	geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
//	dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
//	dos métodos para calcular el área, el perímetro y el valor de PI como constante.
//	Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
//	calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
//	resultado final.
//	Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//	Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
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
