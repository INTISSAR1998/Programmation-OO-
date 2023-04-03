
public class Rectangle extends Forme2D {
	private double longueur;
	private double largeur;
	
	public Rectangle(String c,double lon,double lar){
		super(c);
		this.longueur=lon;
		this.largeur=lar;
	}
	
	public Rectangle(Rectangle r) {
		super(r.getCouleur());
		longueur=r.getLongueur();
		largeur=r.getLargeur();
	}
	public void setLongueur(double lon) { 
		longueur=lon; 
	}
	
	public double getLongueur() { 
		return(this.longueur);
	}
	
	public void setLargeur(double lar) {
		largeur=lar; 
	}
	
	public double getLargeur() { 
		return(this.largeur); 
	}
	
	public  double perimetre() { 
		return 2*(longueur+largeur);	
	}
	
	public double surface() { 
		return longueur*largeur;
	}
	
	public String toString(){				
	return"rectangle(longueur="+longueur+",largeur="+largeur+",perimetre="+perimetre()+",surface="+surface()+")";
	}		
}

