package Exercise3;

import java.util.ArrayList;

public class MainElectrodomestico {
//	Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//	para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//	Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//	deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//	televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//	precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//	2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//	electrodomésticos, 2000 para lavadora y 5000 para televisor.Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//	para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//	Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//	deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//	televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//	precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//	2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//	electrodomésticos, 2000 para lavadora y 5000 para televisor.
	public static void main(String[] args) {
//		Electrodomestico nevera = new Electrodomestico();
		Lavadora la = new Lavadora();
		la.setPrecio(100);
		la.setConsumo("A");
		la.setPeso(20);
		la.setCarga(31);
//		System.out.println("El precio final de la lavadora es:" +la.precioFinal());
		Lavadora la1 = new Lavadora(100,"azul","A",20,29);
//		System.out.println("El precio final de la lavadora es:" +la1.precioFinal());
		
		Televisor tele = new Televisor();
		tele.setPrecio(100);
		tele.setConsumo("A");
		tele.setPeso(20);
		tele.setResolucion(31);
//		System.out.println("El precio final del televisor  es:" +tele.precioFinal());
		Televisor tele1 = new Televisor(100,"azul","A",20,31,true);
//		System.out.println("El precio final del televisor  es:" +tele1.precioFinal());
		
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
		electrodomesticos.add(tele1);
		electrodomesticos.add(la);
		electrodomesticos.add(tele);
		electrodomesticos.add(la1);
		double acomTv =0;
		double acomNevera =0;
		for (Electrodomestico electro: electrodomesticos) {
			String tipoElectrodomestico= (electro instanceof Televisor)? "Televisor": "Nevera";
			double preciofinal=electro.precioFinal();
			System.out.println("El precio final del " + tipoElectrodomestico + " es de: "  + (preciofinal));
			if(tipoElectrodomestico=="Televisor") {
				acomTv+=(preciofinal);
			}else {
				acomNevera+= (preciofinal);
			}
		}
		System.out.println("El acomulado de las neveras fue de: $"+ acomNevera);
		System.out.println("El acomulado de los televisores fue de: $"+ acomTv);
		System.out.println("El total fue de: $"+ (acomTv+acomNevera));
	}
}
