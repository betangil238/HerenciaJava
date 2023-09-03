package Exercise2;

public class MainElectrodomestico {
//	Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//	consumo energético (letras entre A y F) y peso.
//	Los constructores que se deben implementar son los siguientes:
//	• Un constructor vacío.
//	• Un constructor con todos los atributos pasados por parámetro.
//	Los métodos a implementar son:
//	• Métodos getters y setters de todos los atributos.
//	• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//	sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//	objeto y no será visible.
//	• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//	usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//	blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//	minúsculas. Este método se invocará al crear el objeto y no será visible.
//	• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//	electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//	precio se le da un valor base de $1000.
//	• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//	precio. Esta es la lista de precios:
//	A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
//	además de los atributos heredados.
//	Los constructores que se implementarán serán:
//	• Un constructor vacío.
//	• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
//	llamar al constructor de la clase padre.
//	Los métodos que se implementara serán:
//	• Método get y set del atributo carga.
//	• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//	padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//	el atributo propio de la lavadora.
//	• Método precioFinal(): este método será heredado y se le sumará la siguiente
//	funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//	carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//	método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//	visto en la clase Electrodoméstico también deben afectar al precio.
//	Se debe crear también una subclase llamada Televisor con los siguientes atributos:
//	resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
//	heredados.
//	Los constructores que se implementarán serán:
//	• Un constructor vacío.
//	• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
//	heredados. Recuerda que debes llamar al constructor de la clase padre.
//	Los métodos que se implementara serán:
//		• Método get y set de los atributos resolución y sintonizador TDT.
//		• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//		padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//		los atributos del televisor.
//		• Método precioFinal(): este método será heredado y se le sumará la siguiente
//		funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//		incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//		$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//		también deben afectar al precio.
//		Finalmente, en el main debemos realizar lo siguiente:
//		Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//		el precio final de los dos electrodomésticos.
	public static void main(String[] args) {
//		Electrodomestico nevera = new Electrodomestico();
		Lavadora la = new Lavadora();
		la.setPrecio(100);
		la.setConsumo("A");
		la.setPeso(20);
		la.setCarga(31);
		System.out.println("El precio final de la lavadora es:" +la.precioFinal());
		Lavadora la1 = new Lavadora(100,"azul","A",20,29);
		System.out.println("El precio final de la lavadora es:" +la1.precioFinal());
		
		Televisor tele = new Televisor();
		tele.setPrecio(100);
		tele.setConsumo("A");
		tele.setPeso(20);
		tele.setResolucion(31);
		System.out.println("El precio final del televisor  es:" +tele.precioFinal());
		Televisor tele1 = new Televisor(100,"azul","A",20,31,true);
		System.out.println("El precio final del televisor  es:" +tele1.precioFinal());
	}
	
	

}
