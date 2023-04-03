package ex1partie2;

public class Cercle implements Forme,Affichable {
	private Point centre;
	private double rayon;
	public Cercle(Point c,double r){
		this.centre=c;
		this.rayon=r;
	}
	public void setCentre(Point c){
		centre=c;
	}
	public Point getCentre(){
		return(this.centre);
	}
	public void setRayon(double r){
		rayon=r;
	}
	public double getRayon(){
		return(this.rayon);
	}
	public  double perimetre(){
		return 2*rayon*Math.PI;
	}
	public double surface(){
		return rayon*rayon*Math.PI;
	}
	public String toString(){
		return"cercle(centre="+centre.toString()+",rayon="+rayon+",perimetre="+perimetre()+",surface="+surface()+")";
	}
	public void afficher(){
		System.out.println(toString());
	}	
}
