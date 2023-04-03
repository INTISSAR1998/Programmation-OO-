package ex1partie2;
class Point implements Affichable {
	private double x;
	private double y;
	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public void setX(double x){
		x=x;
	}
	public double getX(){
		return(this.x);
	}
	public void setY(double y){
		y=y;
	}
	public double getY(){
		return(this.y);
	}
	public String toString(){
		return"(x:"+x+",y:"+y+")";
	}
	public void afficher(){
		System.out.println(toString());
	}
}
	
