package mvc;
import javax.swing.*;

import java.awt.*;
import java.util.Observable;


public class modele  extends Observable {
	public Color couleur1;
	public  Color couleur2;
	
	public modele(){
		this.couleur1=Color.RED;
		this.couleur2=Color.BLUE;
	}
	public void changercouleur(int i){
		if ( i==1){
			if (couleur1==Color.RED)
				couleur1 =Color.BLUE ;
			else couleur1=Color.RED;
		}
		else {if (couleur2==Color.RED)
			couleur2=Color.BLUE;
		else couleur2=Color.RED ;}
		setChanged();
		notifyObservers();
		}
	}


