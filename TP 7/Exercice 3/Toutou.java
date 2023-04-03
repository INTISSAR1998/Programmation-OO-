package Exercice3;

public class Toutou {
	private String nom;
	private int nombre;

		public Toutou(String n,int nb)  throws IllegalArgumentException {
			if (n==null)
				throw new IllegalArgumentException("nom null");
				nom=n;
				if ( nb<0)
				throw new IllegalArgumentException("nombre Puces négative");
				nombre=nb;
		}
		public String getNom (){
			return (nom); 
		}
		public void setNom (String n){
			this.nom= n;
		}
		public int getNombre (){
			return(nombre);
		}
		public void setNombre (int nb){
			this.nombre=nb;
		}
		public String toString(){
			return ("Toutou (nom:"+nom+",nombre de Puces "+nombre+")");
		}
		
}
