package ex1;

public class TestBanque {
	
	public static void main(String[] args) {
		Client c1=new Client("Alain","A",1,100);
		Client c2=new Client("Jean","J",2,200);
		Client c3=new Client("Fréderique","F",3,300);
		Client c4=new Client("Jean pierre","JP",4,400);
		Banque B=new Banque("banque régionale");
		B.AjouterCompteClient(c1);
		B.AjouterCompteClient(c2);
		B.AjouterCompteClient(c3);
		B.AjouterCompteClient(c4);
		Client c=B.ChercherCompteClient(1);
		if(c!=null)
			System.out.println("le client"+c+".existe");
			System.out.println("le client n'existe pas");
		B.AfficherrCompteClient(2);
		B.IncrementerrCompteClient(100);
		B.AfficherrCompteClient(2);
	}

}
