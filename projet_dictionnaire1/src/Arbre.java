

import java.util.Scanner;

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
   public void affiche (String ch ) {
	
	if(this.racine==null) 
		return ;
	
	ch+=racine.lettre;
		
		if(this.racine.rep >0)
		{
		System.out.println(ch+"-->"+racine.rep);
		}
		
		int i=0;
	while(racine.suivant[i]!=null) {
		
		new Arbre(this.racine.suivant[i]).affiche(ch);
		i++;
		
	}
	}
   public void insert (String[] t1 ,int[] t2,String ch ,int x)
   {int i ;
	  for (i=0;i<4;i++) 
	  {
		if(t1[i]<ch) 
		{   
		String	aux=t1[i];
		int aux1=t2[i]
			t1[i]=ch ;
			t2[i]=x ;
			ch==aux
		}
	  }
   }
   public void affiche1 (String ch,String[] t1 ,int[] t2 ) {
		
		if(this.racine==null) 
			return ;
		
		ch+=racine.lettre;
			
			if(this.racine.rep >0)
			{
		
			insert(t1,t2,ch,racine.rep) ;
			}
			
			int i=0;
		while(racine.suivant[i]!=null) {
			
			new Arbre(this.racine.suivant[i]).affiche(ch);
			i++;
			
		}
		}   


}

	
	


