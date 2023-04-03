
public class Animal {
	private int nbpattes;
	private String couleur;
	
	public Animal(){
		
	}
	public Animal(int nb,String coul){
		nbpattes=nb;
		couleur=coul;
	
	}
	public void setCouleur(String coul){
		couleur=coul;
	}
	public String getCouleur(){
		return(this.couleur);
	}
	public void setNbpattes(int nb){
		nbpattes=nb;
	}
	public int getNbpattes(){
		return(this.nbpattes);
	}
	public String Jemangequoi(){
		return("?");
	}
	public String toString(){
		return"Animal(nombre pattes:"+nbpattes+",couleur de pelage:"+couleur+",et il mange:"+Jemangequoi()+")";
	}

}
