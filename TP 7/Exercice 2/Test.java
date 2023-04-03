package Exercice2;

public class Test {

	public static void main(String[] args) {
	Entreprise[] tab=new Entreprise [4];
	tab[0]=new Entreprise("Microsoft","developpement logiciels",1000,1000000);
	tab[1]=new Entreprise("Ford","fabrication voitures",1500,2000000);
	tab[2]=new EntrepriseSecrete("CIA","espionnage VIP",1000,3000000);
	tab[3]=new EntrepriseSansProfit("Croix-Rouge","aude réfugiés",1500,300000);
	afficherEntreprises(tab);
	}
	public static void afficherEntreprises (Entreprise[]tab){
		for(int i=0;i<tab.length;i++){
			try{System.out.println("la mission est :" + tab[i].getMission());}
			catch(SecretMissionException e)
				{System.out.println(e);}
			try{System.out.println("le capital est :" + tab[i].getCapital());}
			catch(NomProfitException e)
				{System.out.println(e);}
	}
	}
}
