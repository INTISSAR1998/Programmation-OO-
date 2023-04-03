package ex1;

public class Client {
	private String nom;
	private String prenom;
	private int ident;
	private double montant;
	
	public Client(){
		
	}
	public Client(String n,String p,int i,double m){
		nom=n;
		prenom=p;
		ident=i;
		montant=m;
	
	}
	public void setNom(String n){
		nom=n;
	}
	public String getNom(){
		return(this.nom);
	}
	public void setPrenomom(String p){
		prenom=p;
	}
	public String getPrenom(){
		return(this.prenom);
	}
	public void setIdent(int i){
		ident=i;
	}
	public int getIdent(){
		return(this.ident);
	}
	public void setMontant(double m){
		montant=m;
	}
	public double getMontant(){
		return(this.montant);
	}
	public String toString(){
		return"Client(nom:"+nom+",prenom:"+prenom+",identificateur:"+ident+",montant:"+montant+")";
	}
	public void ajouter(double m){
		montant+=m;
	}
	public static void main(String[] args) {
		Client c=new Client("XX","YY",100,1000);
		System.out.println (c);
		c.ajouter(100);
		System.out.println (c);
	}
}
