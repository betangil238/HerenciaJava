package Exercise2;

public final class Televisor extends Electrodomestico {
	
	private double resolucion;
	private boolean TDT;
	public Televisor() {
		super();
	}
	public Televisor(double precio, String color, String consumo, double peso, double resolucion, boolean TDT) {
		super(precio, color, consumo, peso);
		this.resolucion=resolucion;
		this.TDT=TDT;
	}
	public double getResolucion() {
		return resolucion;
	}
	public boolean isTDT() {
		return TDT;
	}
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	public void setTDT(boolean tDT) {
		TDT = tDT;
	}
	
	@Override
	public double precioFinal() {
		super.precioFinal();
		if (precio==0) {
			return 0;	
		}else if (resolucion==0) {
				System.out.println("Falto parametrizar la resolucion para saber el precio final");
				return 0;	
		} 
		if (resolucion>40) {
			this.precio=this.precio*1.3;
		}
		
		if (TDT==true) {
			this.precio+=500;	
		}
		return precio;
	}

	
	

}
