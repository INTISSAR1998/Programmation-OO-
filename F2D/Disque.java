package F2D;

public class Disque extends Form2D{
	
	private double rayon;

	public Disque(double rayon ,String col) {
		super(col);
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public  double perimetre() { 
		return 2*rayon*Math.PI;
	}
	public double aire() { 
		return rayon*rayon*Math.PI; 
	}
	public double diametre() {
	return rayon*2;
	}
	@Override
	public String toString() {
		return "Disque [rayon= " + rayon +  " couleur= " + couleur +"]";
	}
	
}

