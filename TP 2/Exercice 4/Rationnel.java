
public class Rationnel {

	private int num,den;
	
	public Rationnel (int a,int b){
		num=a;
		den=b;
	}
	public Rationnel (int b){
		num=2;
		den=b;
	}
	public Rationnel (){
	
	}
	public void setNum (int a){
		num=a;
	}
	public void setDen (int b){
		den=b;
	}
	public int getNum(){
		return(num);
	}
	public int getDen(){
		return(den);
	}
	public String toString(){
		return("("+num+"/"+den+")");
    }
	public Rationnel somme(Rationnel b){
		int numR=num*b.den+den*b.num;
		int denR=den*b.den;
		return new Rationnel(numR,denR);
	}
	public Rationnel produit(Rationnel b){
		int numR=num*b.num;
		int denR=den*b.den;
		return new Rationnel(numR,denR);
	}
}
