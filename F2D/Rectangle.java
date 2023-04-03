package F2D;

public class Rectangle extends Form2D {
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double log, double lag ,String col) {
		super(col);
		this.longueur = log;
		this.largeur = lag;
	}
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public  double perimetre() {
		return 2*(longueur+largeur);
	}
	public double aire() { 
		return longueur*largeur; 
	}
	@Override
	public String toString() {
		return "Rectangle [longueur= " + longueur + ", largeur= " + largeur + "couleur= " + couleur +"]";
	}
	
}
