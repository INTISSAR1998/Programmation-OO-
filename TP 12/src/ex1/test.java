package ex1;

public class test {

	public static void main(String[] args) {
		
		Personne a=new Personne("ghassen","98765432",52,null)  ;
		
		Personne b=new Personne("hghh","98764532",52,null) ;
		
		Personne c=new Personne("hhg","98745432",52,null) ;
		
		a.suivant=b ;
		b.suivant=c ;
		
		ListePersonne l =new ListePersonne(a) ;
		
		
		
		int x=l.longueur() ;
		
		System.out.println("longueur de liste est "+x );
		
		l.afficheListe() ;
		l.recherchePersonne("98765432") ;
		System.out.println(l.recherchePersonne("987432")  );
		System.out.println(l.recherchePersonne1("98765432")  );
		Personne d=new Personne("gggg","5555555",52,null) ;
	boolean 	ajout=l.ajoutPersonne(d) ;
	System.out.println("ajouter=" +ajout );
	l.afficheListe() ;
	boolean 	ajout1=l.ajoutPersonne1() ;
	System.out.println("ajouter=" +ajout1 );
	l.afficheListe() ;
	
	/*Personne ll=new Personne("gggg","5555555",52,null) ;
	boolean 	supp=l.supprimerPersonne(ll) ;
	System.out.println("supp=" +supp);
	l.afficheListe() ;*/
	}

	

}
