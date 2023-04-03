package tp44;



public class arbre {
	
	noeud racine ;
	
	public arbre(noeud n) {
		
		this.racine = n;
	}
	
	public void afficheArbre() {
		
		if(racine==null)
			return;
		else {
			System.out.print("||"+this.racine.val+"||");
			if(racine.fg!=null)
					new arbre(this.racine.fg).afficheArbre();
			if(racine.fd!=null)
					new arbre(this.racine.fd).afficheArbre();
		}
	}
public void afficheArbrepostefixe() {
		
		if(racine==null)
			return;
		
			
			if(racine.fg!=null)
					new arbre(this.racine.fg).afficheArbrepostefixe();
			if(racine.fd!=null)
				
					new arbre(this.racine.fd).afficheArbrepostefixe();
		
			System.out.print("||"+this.racine.val+"||");
	}
public void afficheArbreinfixe() {
	
	if(racine==null)
		return;
	
		
		if(racine.fg!=null)
				new arbre(this.racine.fg).afficheArbreinfixe();
		
		System.out.print("||"+this.racine.val+"||");
		
		if(racine.fd!=null)
			
			
				new arbre(this.racine.fd).afficheArbreinfixe();
	
	
}
public int max(int a,int b) {
	if(a>b) 
		return a ;
	else 
			return b ;
	
	
}
	

public int prof() {
	
	if(racine==null)
		return 0;
	
		
	else {
			
		return( 1+ max(new arbre(this.racine.fd).prof(),new arbre(this.racine.fg).prof()));
}
}
public boolean  recherche(int a) {
	
	if(racine==null) {
		
	
		return (false) ;
	}else if(racine.val==a) {
		return true ; 
	}
	else
	{
		return (new arbre(this.racine.fg).recherche(a)||new arbre(this.racine.fd).recherche(a));
    }
  }
public int profval(int a ) {
	
	if(racine==null)
		return 0;
	else if (racine.val==a) {
		
		return( 1+ max(new arbre(this.racine.fd).profval(10)*0,new arbre(this.racine.fg).profval(10)*0));
		
	}
		
	else {
		if( new arbre(this.racine.fd).profval(10)>0 ||new arbre(this.racine.fg).profval(10)>0)	
		return( 1+ max(new arbre(this.racine.fd).profval(10),new arbre(this.racine.fg).profval(10)));
		else 
			return(  max(new arbre(this.racine.fd).profval(10)*0,new arbre(this.racine.fg).profval(10)*0));	
}

}
}

		


