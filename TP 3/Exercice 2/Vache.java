
public class Vache extends Herbivore {
	private int quantite;
	public Vache (int q){
		super(2,"noire");
		quantite=q;
	}
	public void setQuantite(int q){
		quantite=q;
	}
	public double getQuantite(){
		return quantite;
	}
	public String toString(){
		return super.toString()+"et il produit une quantite lait :"+quantite+" litre)";
	}
}
