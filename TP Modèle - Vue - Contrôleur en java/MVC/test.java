
public abstract class test {
	public static void main(String[]args){
		modele M =new modele ();
		Vue V=new Vue();
		controleur C=new controleur (M,V);
		M.addObserver(V);
	}
}
