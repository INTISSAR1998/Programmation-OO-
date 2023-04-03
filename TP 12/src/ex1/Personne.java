package ex1;

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


public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
public String getCIN() {
	return CIN;
}
public void setCIN(String cIN) {
	CIN = cIN;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Personne getSuivant() {
	return suivant;
}
public void setSuivant(Personne suivant) {
	this.suivant = suivant;
}




public String toString() {
	return "Personne [nom=" + nom + ", CIN=" + CIN + ", age=" + age +  "]";
}
}

