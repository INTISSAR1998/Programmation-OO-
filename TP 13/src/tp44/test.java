package tp44;




public class test {

	public static void main(String[] args) {
		
		
		
		noeud a=new noeud(null,8,null) ;
		noeud b=new noeud(null,9,null) ;
		noeud c=new noeud(null,10,null) ;
		noeud d=new noeud(null,11,null) ;
		noeud e=new noeud(null,12,null) ;
		noeud f=new noeud(a,4,b) ;
		noeud g=new noeud(c,5,d) ;
		noeud h=new noeud(null,7,null);
		noeud i=new noeud(e,6,null);
		noeud j=new noeud(i,3,h);
		noeud k=new noeud(f,2,g);
		noeud l=new noeud(k,1,j);

		arbre ar =new arbre(l) ;
		
		
		System.out.println("*******************************************************************" );
		System.out.print("**" );
		 ar.afficheArbre();
		 System.out.print("**" ); 
		 System.out.println();
		 System.out.println("*******************************************************************" );
		 System.out.print("**" );
		ar.afficheArbreinfixe() ;
		System.out.print("**" );
		 System.out.println();
		 System.out.println("*******************************************************************" );
		 System.out.print("**" );
		ar.afficheArbrepostefixe() ;
		System.out.println("**" );
		 System.out.println("*******************************************************************" );
		 
		
		 System.out.println( ar.prof()  ); 
		 System.out.println( ar.profval(10)  ); 
		 System.out.println( ar.recherche(10)  ); 
		 
	//	System.out.println("longueur de liste est "+x );
		
	//	l.afficheListe() ;
		
	

}
}