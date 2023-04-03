package F2D;

public  class Form2D implements OperationForm {
	
	protected String couleur = "noir";

	public Form2D(String col) {
		super();
		this.couleur = col;
	}	
	public Form2D() {
		// TODO Auto-generated constructor stub
	}
	public double perimeter() {
		
		return 0;
	}
	public double aire() {
	return 0;
	}
	@Override
	public String toString() {
		return "Form2D [couleur=" + couleur + "]";
	}	
}
