package tp;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne("aaa","321",12,null); 
		Personne p2 = new Personne("aadsdsdsa","32dqdq1",82,null);
		
		ListePersonne lp = new ListePersonne(null);
		lp.AddPersonne(p1);
		lp.AddPersonne(p2);
		System.out.println(lp.longeur());
		lp.afficheListe();
		System.out.println(lp.recherchePersonne("3215"));
		
	}
	
}
