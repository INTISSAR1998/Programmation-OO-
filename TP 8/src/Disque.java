
public class Disque extends Forme2D {
	double rayon;
	final double Pi=3.14159;
	
	public Disque(String c,double r){
		super(c);
		rayon=r;
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public double getDiametre() {
		return(rayon*2);
	}
	
	public double perimetre() {
		return(rayon*rayon*Pi);
	}
}
