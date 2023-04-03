package F2D;

public class Form3D implements OperationForm {
	
	protected String couleur;

	public Form3D(String couleur) {
		
		this.couleur = couleur;
	}
	public double volume() {
		return 0;
	}
	public double perimeter() {
		return 0;
}
	@Override
	public String toString() {
		return "Form3D [couleur=" + couleur + "]";
	}
	
}
