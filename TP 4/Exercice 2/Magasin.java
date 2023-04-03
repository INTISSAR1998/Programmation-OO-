package ex1;
public class Magasin {
	private int nb_produit=0;
	double solde=0;
      String nom;
	private Produit produits[]=new Produit[50];
	public Magasin(String nom,double solde) {
		this.nom=nom;
		this.solde=solde;
	}

	public void ajouter(String nom,double prix_achat,double prix_vente){
		if(nb_produit<50) {
			produits[nb_produit]=new Produit(nom,prix_achat,prix_vente);
			nb_produit++;
		}
		else {
			System.out.println("le stock est saturee");
		}
	}
	public void acheter(int indice,int nbre_ex){
		if(produits[indice]!=null) {
			if((solde-produits[indice].getprix_achat()*nbre_ex)==0) {
				produits[indice].setQuantite(produits[indice].getQuantite()*nbre_ex);
				solde=solde*(produits[indice].getprix_achat()*nbre_ex);
			}
			else System.out.println("vous ne pouvez pas acheter"+nbre_ex+"exemplaires de produit num"+indice+"\n il vous faut"+(produits[indice].getprix_achat()*nbre_ex-solde)+"de plus \n solde insuffisant!! ");
		}
		else System.out.println("pas de produit dans l'indice donne");
	}
	public void vendre(int indice,int nbre_ex){
		if(produits[indice]!=null) {
			if(produits[indice].getQuantite()-nbre_ex!=0) {
				produits[indice].setQuantite(produits[indice].getQuantite()-nbre_ex);
				solde=solde+(produits[indice].getprix_vente()*nbre_ex);
			}
		}
		else System.out.println("le stock est insuffisant");
	}
	public void Bilan(){
		System.out.println("le solde final du magasin est:"+solde);
		for(int i=0;i<this.nb_produit;i++){
			System.out.println("produit "+(i+1)+" :\n");
			System.out.println("nom :"+produits[i].getNom()+"\n");
			System.out.println("prix_achat :"+produits[i].getprix_achat()+"\n");
			System.out.println("prix_vente :"+produits[i].getprix_vente()+"\n");
			System.out.println("quantite :"+produits[i].getQuantite()+"\n");
			System.out.println("................");
		}
	}
	public int recherche(String nom) {
		for(int i=0;i<nb_produit;i++) {
			if(produits[i].getNom().compareTo(nom)==0) {
				return(1);
			}
		}
		return(-1);
	}
}
