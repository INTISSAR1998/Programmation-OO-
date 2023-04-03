package tp;

public class ListePersonne {
	public Personne premier;
	public ListePersonne (Personne p) {
		this.premier=p;
	}
public int longeur() {
	if (this.premier==null){
		return 0 ; 
	} 
	else {
		return 1+ new ListePersonne(premier.suivant).longeur();
	}
}
public void AddPersonne(Personne p) {
	if (premier == null) {
		premier=p; 
	}
	else {
		Personne courant = premier ; 
		while (courant!=null) {
			if (courant.suivant == null) {
				courant.suivant=p; 
				break; 
			}
			courant=courant.suivant;
		}
	}
}
public void affiche() {	
	if (this.premier==null){
		System.out.println("Fin de la liste ");
	} 
	else {
		System.out.println("Nom : "+this.premier.nom+" cin : " +this.premier.CIN);
		new ListePersonne(premier.suivant).affiche();
	}
	
	}

public void afficheListe() {
	if (premier == null) {
		System.out.println("La liste est vide !");
	}
	else {
		this.affiche();
	}
}
public boolean recherchePersonne(String cin) {
	if (this.premier==null ){
		
		return false ; 
	} 
	else {
		if (this.premier.CIN.equals(cin)) {
			return true ;
		}
		else {
			return false && new ListePersonne(premier.suivant).recherchePersonne(cin);
		}
	}
}

}
