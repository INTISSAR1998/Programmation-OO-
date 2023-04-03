
public class TestRationnel {

	
	public static void main(String[] args) {
		Rationnel a = new Rationnel(1,2);
		Rationnel b = new Rationnel(2);
		Rationnel c = new Rationnel();
		c.setNum(1); c.setDen(5);
		System.out.println(a.getNum()); // doit afficher 1
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
		System.out.println(a.somme(b));
		System.out.println(a.produit(b));
	}

}
