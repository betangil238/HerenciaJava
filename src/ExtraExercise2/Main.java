package ExtraExercise2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int polideportivos=0;
		int techados=0;
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();
		edificios.add(new Polideportivo(100, 50, 100, "Doña gabriela"));
		edificios.add(new Polideportivo(60, 100, 80, "Ed leocon"));
		edificios.add(new EdificioDeOficinas(120, 70, 88, 5, 10, 5));
		edificios.add(new EdificioDeOficinas(67, 67, 67, 8, 12, 5));
		
		for (Edificio ed: edificios) {
			ed.calcularSuperficie();
			ed.calcularVolumen();
			if (ed instanceof Polideportivo) {
				polideportivos++;
				if(((Polideportivo) ed).getInstalacion()=="Techado") {
					techados++;
				}
			}else {
				((EdificioDeOficinas) ed).cantPersonas();
			}
		}
		System.out.println("Hay un total de: "+polideportivos+" polideportivos, de los cuales "+techados+" son techados");
		System.out.println("Por tanto hay: "+(polideportivos-techados)+" al aire libre");
	}

}
