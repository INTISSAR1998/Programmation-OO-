package ex1;

public class Capitale extends Ville  {
	private String [] monuments;
	public Capitale(String nom, int nbh,String[]monu){
		super(nom,nbh);
		monuments=new String [monu.length];
		for(int i=0;i<monu.length;i++)
			monuments[i]=monu[i];
	}
	public String getMonuments(int i){
		return(this.monuments[i]);
	}
	public void setMonuments(int i , String val){
		monuments[i]=val;
	}
	public String toString(){
		String s="liste monuments\n";
		for(int i=0;i<monuments.length;i++)
			s="\t"+monuments[i]+"\n";
		return super.toString()+"\n"+s;
	}
}
