package ExtraExercise1;

public class Velero extends Barco {
	protected int numMastil;

	public Velero() {
		super();

	}

	public Velero(String matricula, double eslora, int anofabrica,int numMastil) {
		super(matricula, eslora, anofabrica);
		this.numMastil=numMastil;
	}

	public int getNumMastil() {
		return numMastil;
	}

	public void setNumMastil(int numMastil) {
		this.numMastil = numMastil;
	}

	@Override
	public String toString() {
		return super.toString()+" [numMastil=" + numMastil + "]";
	}
	
	

}
