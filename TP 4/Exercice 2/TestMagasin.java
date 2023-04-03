package ex1;

public class TestMagasin {

	public static void main(String[] args) {
		Magasin m=new Magasin("m1",1000);
		m.ajouter("Hp",700,900);
		m.Bilan();
		m.ajouter("Acer",800,1000 );
		m.Bilan();

		System.out.println("le solde initial est"+m.solde);{
		    m.acheter(0,4);
			m.Bilan();
			m.acheter(1,5);
			m.Bilan();
			m.vendre(0,3);
			m.Bilan();
			m.vendre(1,2);
			m.Bilan();
			m.acheter(1,10);
			m.Bilan();
		}
       if(m.recherche("HP")!=1) {
    	   System.out.println("le produit HP est a l'indice :"+m.recherche("HP"));
       }
       else System.out.println("le produit HP n'est pas trouve");
       if(m.recherche("Toshiba")!=-1) {
    	   System.out.println("le produit Toshiba est a l'indice :"+m.recherche("Toshiba"));
       }
       else System.out.println("le produit Toshiba n'est pas trouve");
	}
}
