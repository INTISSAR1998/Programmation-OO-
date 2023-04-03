
public class TestPersonne {

		public static void main(String[] args) {
			Personne a=new Personne("toto",34);
			Personne b=new Personne("tata");
			Personne c=new Personne();
			b.setAge(56);
			c.setNom("titi");c.setAge(12);
			System.out.println(a.getAge()); // doit afficher 34
			System.out.println(a); // doit afficher (*toto, 34*)
	}

}