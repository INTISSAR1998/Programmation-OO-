import java.awt.BorderLayout ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
public class ControleEtiquette extends JToolBar  {
	private EtiquetteSimple etq;
	private final int[]positions={ JLabel.LEFT,JLabel.CENTER,JLabel.RIGHT, JLabel .TOP,JLabel.CENTER,JLabel.BOTTOM};
    private ImageIcon [] iconesBouttons =new ImageIcon[18];
    private JRadioButton [] bouttons =new  JRadioButton[6];
    private ButtonGroup  []groupes =new  ButtonGroup[2];
    private final String []nomsIcones={"bhgauche" ,"bhcentre", "bhdroite", "bvhaut", "bvcentre", "bvbas"};
    private void chargerIcones(){
        for(int i=0;i<6;i++){
            iconesBouttons [i]=new ImageIcon("C:\\Users\\isima\\Desktop\\imageTpJavaSwing\\"+nomsIcones[i]+".gif");
            iconesBouttons[i+6]=new ImageIcon("C:\\Users\\isima\\Desktop\\imageTpJavaSwing\\"+nomsIcones[i]+"R.gif");
            iconesBouttons[i+12]=new ImageIcon("C:\\Users\\isima\\Desktop\\imageTpJavaSwing\\"+nomsIcones[i]+"B.gif");
        }}
    private void creerBoutons(){
		for(int i=0;i<6;i++){
			bouttons[i]=new JRadioButton(iconesBouttons[i]);
			bouttons[i].setSelectedIcon(iconesBouttons[i+6]);
			bouttons[i].setRolloverIcon(iconesBouttons[i+12]);
			bouttons[i].setRolloverEnabled(true);
		}
        groupes [0]=new ButtonGroup();
        groupes [1]=new ButtonGroup();
        for(int j=0 ;j<3;j++){
            groupes[0].add(bouttons[j]);
            groupes[0].add(bouttons[j+3]);

		}
	}
	private ControleEtiquette(){
		super();
		chargerIcones();
		creerBoutons();
		for(int i=0;i<3;i++){
			add(bouttons[i]);
		}
		addSeparator();
		for(int i=3;i<6;i++){
			add(bouttons[i]);
		}
		}
	  class EcouteurHorizontale implements ActionListener{
		private int position ;
		public EcouteurHorizontale (int position){
			this.position=position;
		}
        public void actionPerformed(ActionEvent evt){
            etq.setHorizontalTextPosition(position);
        }

		}
		class Ecouteurverticale implements ActionListener {
			private int position ;
			public Ecouteurverticale (int position){
				this.position=position;
			}
				public void actionPerformed(ActionEvent evt){
					etq.setVerticalTextPosition(position);
				}

			}

		public  ControleEtiquette (EtiquetteSimple et ){
			this();
			etq=et;
			for(int i=0;i<3;i++){
				bouttons[i].addActionListener(new EcouteurHorizontale(positions[i]));
			}
				for(int i=3;i<6;i++){
					bouttons[i].addActionListener(new Ecouteurverticale(positions[i]));
				}
		}

		public static void main(String[]args){
		FenetreSimple cadre= new FenetreSimple("une fenetre avec une foure");
		ImageIcon image=new ImageIcon("C:\\Users\\isima\\Desktop\\imageTpJavaSwing\\fleure.gif");
		EtiquetteSimple et=new EtiquetteSimple ("Une fleure",image);
		cadre.getContentPane().setLayout(new BorderLayout());
		cadre.getContentPane().add(et,BorderLayout.CENTER);
		ControleEtiquette ce=new ControleEtiquette(et);
		cadre.getContentPane().add(ce,BorderLayout.NORTH);
		cadre.pack();
		}

}






