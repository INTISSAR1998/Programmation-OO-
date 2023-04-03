
public class Forme2D {

	private String couleur;
	
	public Forme2D(){
		this.couleur="noir";
	}
	public Forme2D(String c) {
		this.couleur=c;
	}
	public String getCouleur() {
		return(couleur);
	}
	
	public double aire() {
		return (0);
	}
	
	public double perimetre() {
		return (0);
	}
	
	public String toString() {
		return("Couleur ="+this.couleur);
	}
}