
public class TestForme {
	public static void main(String[] args) {
		Forme2D f1 = new Forme2D();
		Forme2D f2 = new Forme2D("blue");
		Rectangle r1 = new Rectangle("Marron",3,3);
		Rectangle r2 = new Rectangle("Vert",6,4);
		Disque d1 = new Disque("jaune",3);
		
		Forme2D[] tabForme = new Forme2D[5];
		tabForme[0] = f1;
		tabForme[1] = f2;
		tabForme[2] = r1;
		tabForme[3] = r2;
		tabForme[4] = d1;
	}
}