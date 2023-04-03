import javax.swing.*;
import java.awt.*;
public class EtiquetteSimple  extends JLabel{
public EtiquetteSimple(String texte ,ImageIcon image){
	super(texte,image,JLabel.CENTER);
	setIconTextGap(20);
	setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
}
public void main (String []args){
	FenetreSimple cadre= new FenetreSimple("Une fenêtre avec une fleure");
	ImageIcon image=new ImageIcon("C:\\Users\\isima\\Desktop\\imageTpJavaSwing\\fleure.gif"");
	EtiquetteSimple et=new EtiquetteSimple ("Une fleure",image);
	et.setHorizontalTextPosition(JLabel.CENTER);
	et.setVerticalTextPosition(JLabel.CENTER);
	//cadre.getContentPane().add(et);//
	JPanel P=new JPanel();
	P.add(et);
	cadre.add(P);
	cadre.pack();
}
}
