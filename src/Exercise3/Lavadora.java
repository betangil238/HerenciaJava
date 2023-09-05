package Exercise3;

public final class Lavadora extends Electrodomestico {
	
	private double carga;

	public Lavadora() {
		super();
	}

	public Lavadora(double precio, String color, String consumo, double peso,double carga) {
		super(precio, color, consumo, peso);
		this.carga=carga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	@Override
	public double precioFinal() {
		super.precioFinal();
		if (precio==0) {
			return 0;	
		}else if (carga==0) {
				System.out.println("Falto parametrizar una carga para saber el precio final");
				return 0;	
		} else if (carga>30) {
			this.precio+=500;
			return precio;	
		}
			return precio;	
		
	
	}
	

}
