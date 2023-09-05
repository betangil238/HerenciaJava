package Exercise3;

import java.util.Arrays;

public class Electrodomestico {
	protected double precio;
	protected String color;
	protected String consumo;
	protected double peso;
	private String arrconsumo[]= {"A","B","C","D","E","F"};
	private String colores[]= {"blanco","negro","rojo","azul","gris"};
	
	
	public Electrodomestico() {
		super();
	}

	public Electrodomestico(double precio, String color, String consumo, double peso) {
		this.precio = precio;
		this.peso = peso;
		comprobarConsumoEnergetico(consumo);
		comprobarColor(color);
	}

	public double getPrecio() {
		return precio;
	}

	public String getColor() {
		return color;
	}

	public String getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setColor(String color) {
		comprobarColor(color);
	}

	public void setConsumo(String consumo) {
		comprobarConsumoEnergetico(consumo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	private void comprobarConsumoEnergetico(String letra) {
		if (Arrays.asList(arrconsumo).contains(letra)) {
			this.consumo = letra;
		}else {
			System.out.println("Se le ha asignado al consumo un valor de F");
			this.consumo = "F";
		}
	}
	
	private void comprobarColor(String color) {
		if (Arrays.asList(colores).contains(color.toLowerCase())) {
			this.color = color.toLowerCase();
		}else {
			System.out.println("Se le ha asignado el color blanco al electrodomestico");
			this.color = "blanco";
		}
	}
	
	public double precioFinal() {
		if (consumo==null || peso==0 || precio==0) {
			System.out.println("Lo sentimos, debe ingrese la informacion de peso, consumo, precio al producto");
			return precio;
		}else {
			
			if(peso>=1 && peso<=19) {
				precio+=100;
			}else if (peso>19 && peso<=49) {
				precio+=500;
			}else if (peso>49 && peso<=79) {
				precio+=800;
			}else if (peso>79) {
				precio+=1000;
			}
			
			if(consumo=="A") {
				precio+=1000;
			}else if (consumo=="B") {
				precio+=800;
			}else if (consumo=="C") {
				precio+=600;
			}else if (consumo=="D") {
				precio+=500;
			}else if (consumo=="E") {
				precio+=300;
			}else if (consumo=="F") {
				precio+=100;
			}
			return precio;
		}
	}
}

