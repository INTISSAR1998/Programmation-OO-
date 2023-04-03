
public class Arbre {
	Noeud racine;
	public Arbre() {
		
		racine=new Noeud ('#');
		}
	public Arbre (Noeud a)
	{
		this.racine=a;
	}

	public void ajoutMot(String w)
	{
		Noeud courant =racine;
		for(int i=0;i<w.length();i++)
			courant=courant.insertNoeud(w.charAt(i));
		
		courant.rep++;
		
	}
	public void afficheNiveau(int a ) {
		if(this.racine==null)
			return ;
		
		System.out.println("Niveau : "+a+" | lettre : "+this.racine.lettre+" | répétitions : "+this.racine.rep);
		
			int i=0;
			while(racine.suivant[i]!=null) {
				new Arbre(this.racine.suivant[i]).afficheNiveau(a+1);
				i++;
			}
			
		}
/*	public void rechercheNiveau(int v ,int p){
		if(racine==null)
			return;
		else
			if(racine.val==v)
				System.out.print("valeur trouvé,niveau"+p);
			else{
				new Arbre(racine.fg).rechercheNiveau(v, p+1);
				new Arbre(racine.fd).rechercheNiveau(v, p+1);
			}
	}*/
public void afficheMot (String a)
{
	if(racine==null)
		return  ;
	a+= racine.lettre;
	if (racine.rep!=0)
		System.out.println(a+"-->"+racine.rep);
		int i=0;
		while(racine.suivant[i]!=null) {
			
			new Arbre(racine.suivant[i]).afficheMot(a);
			
			i++;
		}
}
/*	public void afficheMax (String a){
		if(racine==null)
			return  ;
		int i=0;
		a+= racine.lettre;
			System.out.println(a+"-->"+racine.rep);
			while(racine.suivant[i]!=null) {		
				if ( racine.rep[i] >racine.rep[i+1])
				new Arbre(racine.suivant[i]).afficheMot(a);				
				i++;
			}		
	}*/
	
}
