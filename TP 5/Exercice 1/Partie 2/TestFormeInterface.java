package ex1partie2;

public class TestFormeInterface {
	public static void main(String[] args) {
		Point p=new Point(2,3);
		Affichable c=new Cercle(p,4);
		Affichable r=new Rectangle(2,2);
		Affichable TabObjet[]=new Affichable[3];
		TabObjet[0]=p;
		TabObjet[1]=c;
    	TabObjet[2]=r;
    	for(int i=0;i<TabObjet.length;i++){
    		TabObjet[i].afficher();
    	}
	}

}
