package F2D;

public class test {
	
	public static void main(String[] args) {
		Form2D f=new Form2D();
		Rectangle f1=new Rectangle(5,8,"marron");
		Disque d=new Disque(3,"read");
		Rectangle f2=new Rectangle(4,4,"green");
		Form3D f3 = new Form3D("bleu");
		System.out.println(f);
		System.out.println (f1);
		System.out.println (d);
		System.out.println (f2);
		System.out.println(f3);
		
/*Form2D[] tabForme = new Form2D[5];
tabForme[1]=f1;
tabForme[2]=f2;
tabForme[3]=d;
tabForme[4]=f1;

System.out.println(tabForme[1].toString());
System.out.println(tabForme[4].toString());
System.out.println(((Disque) tabForme[3]).diametre());*/



}

}