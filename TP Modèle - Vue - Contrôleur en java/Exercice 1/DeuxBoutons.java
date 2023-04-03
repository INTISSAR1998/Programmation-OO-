
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeuxBoutons extends JFrame implements ActionListener {
	private JButton b1;
	private JButton b2 ;
	public DeuxBoutons (){
		super();

		b1=new JButton("bouton 1");
		b2=new JButton("bouton 2");
		b1.setForeground(Color.RED);
		b2.setForeground(Color.BLUE);
		JPanel p=new JPanel ();
		p.add(b1);
		p.add(b2);
		setLayout(new BorderLayout());
		add(p,BorderLayout.NORTH );
		b1.addActionListener((ActionListener) this);
		b2.addActionListener(this);
		setSize(300,300);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setVisible(true);}
		public void changerCouleur1(JButton b){
		if (b.getForeground()==Color.RED)
			b.setForeground(Color.BLUE);
		else
			b.setForeground(Color.RED);}

		public void actionPerformed(ActionEvent evt){
			Object source;
			source=evt.getSource();
			if(source==b1){
			changerCouleur1(b2);}
			else
				changerCouleur1(b1);
		}


	private void changerCouleur(JButton b12) {
			// TODO Auto-generated method stub

		}

	public static void main(String[]args){
		DeuxBoutons cadre=new DeuxBoutons ();
		}


}
