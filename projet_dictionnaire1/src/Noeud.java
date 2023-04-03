

public class Noeud {
char lettre;
int rep;
Noeud [] suivant;
public Noeud () {
	
	rep=0;
	suivant=new Noeud[26];
}
public Noeud (char x) {
	lettre=x;
	rep=0;
	suivant =new Noeud [26];
}
public Noeud insertNoeud (char a)
{
	int i=0;
	while (suivant[i]!=null) {
	if (suivant [i].lettre==a)
		return suivant [i];
	i++;	
	}
	suivant[i]=new Noeud(a);	
	return suivant[i];
	
}

}
