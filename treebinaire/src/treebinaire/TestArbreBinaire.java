package treebinaire;

public class TestArbreBinaire {

	public static void main(String[] args) {
		Node x4 = new Node(4,null,null);
		Node x5 = new Node(5,null,null);
		Node x6 = new Node(6,null,null);

		
		Node x7 = new Node(7,null,null);
		Node x3 = new Node(3,x6,x7);	
		Node x2 = new Node(2,x4,x5);
		Node x1 = new Node(1,x2,x3);
		
		Node x8 = new Node(8,null,null);
		Node x9 = new Node(9,null,null);

		Node x10 = new Node(10,null,null);
		Node x11 = new Node(11,null,null);
		Node x12 = new Node(12,null,null);
		
		x4.nodefd=x9;
		x4.nodefg=x8;
		x5.nodefg=x10;
		x5.nodefd=x11;
		x6.nodefg=x12;
		Node x13=new Node(13, null, null);
		x12.nodefd=x13;
		ArbreBinaire rac = new ArbreBinaire(x1);
		rac.afficheHauteur(rac.prof);
		System.out.println("Nombre de noeud :"+rac.nbN+" Nombre de profondeur :"+rac.prof);
		rac.hauteurNode(4, 1);
		
		for(int i=1;i<=rac.prof;i++) {
			for(int j=0;j<rac.prof-i+1/2;j++) {
				System.out.print(" ");}
			rac.afficheNiveau(i, 1);
			System.out.println("");
			
		}
	
	}

}
