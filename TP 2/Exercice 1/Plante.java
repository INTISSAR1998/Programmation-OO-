
public class Plante {
	private String nom;
	public int prix;
	public Plante (String s){
		nom=s;
		prix=10;
	}
	public Plante (String nom,int prix){
	this.nom=nom;//autrement: nom=n;
	this.prix=prix;//autrement: prix=p;
	}
	public void fixePrix (int p){
		prix=p;
	}
	public String toString(){
		return"(" + nom + "," + prix + ")";
	}
	public String getNom(){
		return nom ;
	}
	public void setNom(String s){
		nom=s;
	}
}
