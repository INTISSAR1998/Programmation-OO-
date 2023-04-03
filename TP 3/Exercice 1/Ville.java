package ex1;

public class Ville {
private String nom;
private int nombre;
public  Ville(){
	
}
public Ville(String n,int nb){
	nom=n;
	nombre=nb;
}
public void setNOM(String n){
	nom=n;
}
public String getNom(){
	return(this.nom);
}
public void setNombre(int nb){
	nombre=nb;
}
public int getNombre(){
	return(this.nombre);
}
public String toString(){
	return"(ville:"+nom+",nombre habitants:"+nombre+")";
}
}
