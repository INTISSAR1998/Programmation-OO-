package ex1;

import java.util.Random;
import java.util.Scanner;

public class ListePersonne {
	/*
    0- public int longueur() ;
	1- public void afficheListe() ;
	2- public boolean recherchePersonne(String cin) ;
	3- public Personne recherchePersonne(String cin) ;
	4- public boolean ajoutPersonne(Personne p) ; 
	5- public boolean ajoutPersonne() ;
	6- public boolean supprimerPersonne(Personne p) ;
	7- public boolean supprimerPersonne() ;
 */
	Personne premier ;

	public ListePersonne(Personne premier) {
		super();
		this.premier = premier;
	}

	public  int longueur() {
/*
 Personne n = premier  ;
	int	x= 0 ;
		while(n!=null )
		{x++ ;
			n= n.suivant ;
			
		}
		
	return x ;
	*/
	if(this.premier  ==null) {
		return 0;
	}
	else {
		 ListePersonne p1 =new  ListePersonne(premier.suivant) ;
		return 1+p1.longueur();
	}
		
		
	}
	 public void afficheListe() {
		/* Personne n = premier  ;
			
				while(n!=null )
				{
					System.out.println(n.toString() );
					
					n=n.suivant ;
				}
				*/
		 if(this.premier  ==null) {
			 System.out.println("la liste est "+null );
			}
		 else if (this.premier.suivant  ==null) {
			 System.out.println(premier.toString() );
			  
		 }
			else {
				 ListePersonne p1 =new  ListePersonne(premier.suivant) ;
				 System.out.println(premier.toString() );
				 p1.afficheListe();
			}
	
		 }

	 public boolean recherchePersonne(String cin) {
		 
		 Personne n = premier  ;
		  boolean ok ;
			ok=false ;
			while(n!=null && ok==false )
			{
				if(n.CIN==cin)
				{
					ok=true ;
				}
				
				n=n.suivant ;
			}
			
		 
		return(ok)  ;
	 }
	 public Personne recherchePersonne1(String cin)
	 {
		 Personne n = premier  ;
		 Personne b = premier  ;
		  boolean ok ;
			ok=false ;
			while(n!=null && ok==false )
			{
				if(n.CIN==cin)
				{
					ok=true ;
					b=n ;
					
				}
				
				n=n.suivant ;
			}
		if(ok)
		{
			return (b) ;
		}else
		{
			return null ;
		}
			
	 }
	 public boolean ajoutPersonne(Personne p) {
		 
		 Personne n = premier  ;
			
			while(n.suivant!=null )
			{
				
				
				n=n.suivant ;
			}
			n.suivant=p ;
			
			return (true )  ;
}
public boolean ajoutPersonne1() {
		 
		 Personne n = premier  ;
			
			while(n.suivant!=null )
			{
				
				
				n=n.suivant ;
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("nom=");
			String nom=sc.nextLine();
			System.out.println("CIN=");
			String CIN=sc.nextLine();
			System.out.println("age=");
			int age=sc.nextInt();
			Personne d=new Personne(nom,CIN,age,null) ;
			n.suivant= d;
			
			return (true )  ;
}

/*public boolean supprimerPersonne(Personne p) {
	
	
	 if(courant.CIN==p.CIN)
	 {
		 premier=premier.suivant ;
	 }else
	 {
		 Personne courant ,presedent ;
	presedent= premier  ;
	courant=premier.suivant  ;
		while(courant!=null  )
		{
			if(courant.CIN==p.CIN)
			{
				presedent.suivant=courant.suivant ;
				courant=null ;
				
			}else 
			{
				presedent=courant ;
				courant=courant.suivant ;
			}
			
		}
	
	

}*/}









