package Exercice2;

public class EntrepriseSansProfit extends Entreprise{
	public EntrepriseSansProfit(String n, String m, int nbe, int c){
		super(n, m,nbe,c);
	}
	public int getCapital()throws NomProfitException {
		throw new NomProfitException("Entreprise Sans Profit");
	}
}
