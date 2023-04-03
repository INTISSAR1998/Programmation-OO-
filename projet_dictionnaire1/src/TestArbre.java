

public class TestArbre {
	public static void main(String[] args) {
String [] words = new String[10];
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
words[10]="Italie";
words[11]="ghassen";
words[12]="Italie";
words[13]="ghassen";
words[14]="ghassen";



Arbre a=new Arbre();
for (int i=0;i<words.length;i++)
	a.ajoutMot(words[i]);
a.afficheNiveau(1);
System.out.println("*******************************************");

a.affiche("");
String [] t1;
int [] t2 ;
t1=new String[3] ;
t2=new int[3] ;
a.affiche1("",t1,t2);

}
}