package Exercice2;

public class Entreprise {
		 private String nom;
		 private String mission;
		 private int nbemp;
		 private int capital;
		 public Entreprise (String n, String m, int nbe, int c){
		 	nom=n;
		 	mission=m;
		 	nbemp=nbe;
		 	capital=c;
		 }
		public String getMission () throws SecretMissionException{
			return (mission); 
		}
		public void setMission (String m){
			this.mission= m;
		}
		public int getCapital () throws NomProfitException{
			return (capital); 
		}
		public void setCapital (int c){
			this.capital= c;
		}
}
