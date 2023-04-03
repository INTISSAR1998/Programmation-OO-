import partie2.Personne;
import partie2.Profil;


public class test {
	public static void main (String[] args){
		Profil tab[]=new Profil [3] ;
		Personne tab1[]=new Personne [4] ;
		tab[0]=new Profil("EMP","employe");
		tab[0]=new Profil("SG","secretaire general");
		tab[0]=new Profil("DG","directeur general");
		tab1[0]=new Personne("Mohamed","Ben Ali",800,tab[0]);
		tab1[1]=new Personne("Ahmed","Lassouad",800,tab[0]);
		tab1[2]=new Personne("Samir","Achour",800,tab[0]);
		tab1[3]=new Personne("Nader","Soua",800,tab[0]);
		for(int i=0;i<tab.length;i++)
			tab1[i].afficher();
	}
}
