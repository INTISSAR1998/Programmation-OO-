package treebinaire;

public class ArbreBinaire {
	public Node racine ;
	static int prof ;
	static int nbN ; 
	
	
	public ArbreBinaire(Node raci) {
		this.racine = raci;
	} 
	
	public void afficheHauteur(int a) {
		if(this.racine==null) {
			nbN+=0;
			if(prof<a) {
				prof = a; 
			}
		}
		else {
			System.out.println(this.racine.val);
			nbN+=1;
			a++;
			new ArbreBinaire(this.racine.nodefg).afficheHauteur(a);
			new ArbreBinaire(this.racine.nodefd).afficheHauteur(a);
		}
		
	}
	
	public int proNoeud(int a) {
		if(this.racine.val==a) {
			return 1; 
		}
		else{	
			return 1+ new ArbreBinaire(racine.nodefd).proNoeud(a); 
	}}
	public void hauteurNode(int v, int a) {
		if(this.racine==null) {
			return ;
			
		}
		if (this.racine.val==v) {
			System.out.println("le niveau = "+a);
		} 
		else {
			a++;
			new ArbreBinaire(this.racine.nodefg).hauteurNode(v,a);
			new ArbreBinaire(this.racine.nodefd).hauteurNode(v,a);
			
		}
		
	}
	
	public void afficheNiveau(int a,int b ) {
		if(this.racine==null)
			return ;
		if (a==b)
			System.out.print(this.racine.val+"|");
		else 
		{
			b++; 
			new ArbreBinaire(this.racine.nodefg).afficheNiveau(a,b);
			new ArbreBinaire(this.racine.nodefd).afficheNiveau(a,b);
			
		}
	}
	
	
	
}
