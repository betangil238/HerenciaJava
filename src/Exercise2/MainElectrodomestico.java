package Exercise2;

public class MainElectrodomestico {

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
