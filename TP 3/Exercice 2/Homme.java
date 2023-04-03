
public class Homme extends Omnivore {
	private double salaire;
	public Homme (double s){
		super(2,"rose");
		salaire=s;
	}
	public void setSalaire(double s){
		salaire=s;
	}
	public double getSalaire(){
		return salaire;
	}
	public String toString(){
		return super.toString()+"et il gagne une salaire:"+salaire;
	}
}
