package Exercise1;

public class MainAnimal {
	//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
	//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
	//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
	//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
	//siguiente:
	public static void main(String[] args) {
		
	Animal perro1 = new Perro("Stich","Carne",15,"doverman");
	perro1.Alimentarse();
	
	Animal perro2 = new Perro("Teddy","Croquetas",10,"chihuahua");
	perro2.Alimentarse();
	
	Animal gato1 = new Gato("Pelusa","Galletas",15,"siames");
	gato1.Alimentarse();
	
	Animal caballo1 = new Caballo("Spark","Pasto",25,"fino");
	caballo1.Alimentarse();
	}
}
