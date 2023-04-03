package mvc;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Observable;

public class controleur implements ActionListener  {
	public modele M;
	public Vue V;
	public controleur (modele M,Vue V){
		this.M=M;
		this.V=V;
		V.b1.addActionListener ( this);
		V.b2.addActionListener ( this);}
		public void actionPerformed(ActionEvent evt){
			Object source=evt.getSource();
			if(source==V.b1) M.changercouleur(2);
			else M.changercouleur(1);
		
		
	}

	
	}


