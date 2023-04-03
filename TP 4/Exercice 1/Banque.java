package ex1;

public class Banque {
	private String nom;
	private int nbclts;
	public Client[] clients;
		public Banque(String nom){
		this.nom=nom;
		nbclts=0;
		clients=new Client[20];
	}
	public void setNom(String n){
		nom=n;
	}
	public String getNom(){
		return(this.nom);
	}
	public void setNbclts(int nb){
		nbclts=nb;
	}
	public int getNbclts(){
		return(this.nbclts);
	}
	public Client ChercherCompteClient(int id){
		boolean trouve=false;
		Client c=null;
		for(int i=0;i<nbclts;i++)
		{
			if(clients[i].getIdent()==id)
			{
				trouve=true;
				c=clients[i];
			}
		}
		return c;
	}
	public void AjouterCompteClient(Client c){
		if(nbclts<clients.length){
			if(ChercherCompteClient(c.getIdent())==null){
				clients[nbclts]=c;
				nbclts++;}
		else { System.out.println("client.existe");}}
		else { System.out.println("banque saturee");}
	}
	public void IncrementerrCompteClient(double montant){
		for(int i=0;i<nbclts;i++){
			clients[i].ajouter(montant);
		}
	}
	public void AfficherrCompteClient(int n){
		Client c= ChercherCompteClient(n);
	    System.out.println("le nom du client est:"+c.getNom()+",et le montant est:"+c.getMontant());
	}
}

