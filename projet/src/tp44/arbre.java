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
	
public void insertmot(String ch) {
		
noeud	aux= racine ;	

String s = "f"; 
s = s+ch.charAt(0); 

          if(aux.s==null   )
          {
        	  
          }
          
       
			System.out.print("||"+this.racine.val+"||");
			if(racine.fg!=null)
					new arbre(this.racine.fg).afficheArbre();
			if(racine.fd!=null)
					new arbre(this.racine.fd).afficheArbre();
		}
	}
	

		


