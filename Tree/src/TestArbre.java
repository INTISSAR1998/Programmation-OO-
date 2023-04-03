
public class TestArbre {
	public static void main(String[] args) {
		String [] words = new String[20];
		words[0]="Tunisie";
		words[1]="Turky";
		words[2]="France";
		words[3]="Finlondre";
		words[4]="Italie";
		words[5]="Tunis";
		words[6]="Turky";
		words[7]="France";
		words[8]="Finlondre";
		words[9]="Italie";
		words[10]="France";
		words[11]="France";
		words[12]="France";
		words[13]="Italie";
		words[14]="Italie";
		words[15]="Italie";
		words[16]="Italie";
		words[17]="Italie";
		words[18]="Turky";
		words[19]="Turky";





		Arbre a=new Arbre();
		for (int i=0;i<words.length;i++)
			a.ajoutMot(words[i]);
		a.afficheMot("");



		}

}
