import javax.swing.*;
 class FenetreSimple extends JFrame{
	 public FenetreSimple (String titre){
		 super(titre);
		 setSize(300,150);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);

	 }
	 public static void main(String[]args){
		 FenetreSimple cadre=new FenetreSimple("Fenetre simple");
	 }

}
