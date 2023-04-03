package tp;

public class Personne{
	public String nom ;
	public String CIN ;
	public int age ;
	public Personne suivant ;
	
	public Personne(String nom, String cIN, int age, Personne suivant) {
		super();
		this.nom = nom;
		CIN = cIN;
		this.age = age;
		this.suivant = suivant;
	}

	
	
}