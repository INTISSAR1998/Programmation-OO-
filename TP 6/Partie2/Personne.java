package partie2;

import partie1.iPersonne;

public class Personne implements iPersonne {
	private int id;
	private String nom;
	private String prenom;
	private double salaire;
	private Profil P;
	static int cpt;
	public Personne(String n,String p, double s,Profil P1){
		cpt++;
		id=cpt;
		nom=n;
		prenom=p;
		salaire=s;
		P=P1;
	}
	public double calculersalaire (){
		if (P.getCode()=="EMP")
			salaire=salaire +0.1*salaire;
		if (P.getCode()=="SG")
			salaire=salaire + 0.2* salaire;
		if (P.getCode()=="DG")
			salaire=salaire +0.3* salaire;	
		return salaire;
	}
	public void afficher(){
		System.out .println("la personne: "+P.getLibelle()+", a pour nom: "+this.nom+", prenom: " +this.prenom+" , salaire: "+calculersalaire() );
		
}
}