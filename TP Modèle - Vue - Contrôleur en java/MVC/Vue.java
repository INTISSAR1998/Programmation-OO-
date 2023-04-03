
import javax.swing.*;
import java.awt.*;
import java .util.Observer;
import java.util.Observable;

public class Vue extends JFrame implements Observer {
	JButton b1;
	public JButton b2 ;
	public Vue (){
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
		setSize(300,300);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setVisible(true);}
public void update (Observable M,Object arg){
	b1.setForeground(((modele)M).couleur1);
	b2.setForeground(((modele)M).couleur2);}
	}
