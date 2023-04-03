package ex1partie1;

public class TestForme {

	public static void main(String[] args) {
		Point p=new Point(2,3);
		Cercle c=new Cercle(p,4);
		Rectangle r=new Rectangle(2,2);
		System.out.println (p);
		System.out.println (c);
		System.out.println (r);
	}

}
