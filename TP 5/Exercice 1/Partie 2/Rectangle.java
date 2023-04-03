package ex1partie2;

public class Rectangle implements Forme,Affichable {
		private double longueur;
		private double largeur;
		public Rectangle(double lon,double lar){
			this.longueur=lon;
			this.largeur=lar;
		}
		public void setLongueur(double lon){
			longueur=lon;
		}
		public double getLongueur(){
			return(this.longueur);
		}
		public void setLargeur(double lar){
			largeur=lar;
		}
		public double getLargeur(){
			return(this.largeur);
		}
		public  double perimetre(){
			return 2*(longueur+largeur);
		}
		public double surface(){
			return longueur*largeur;
		}
		public String toString(){
			return"rectangle(longueur="+longueur+",largeur="+largeur+",perimetre="+perimetre()+",surface="+surface()+")";
		}		
		public void afficher(){
			System.out.println(toString());
		}
}

