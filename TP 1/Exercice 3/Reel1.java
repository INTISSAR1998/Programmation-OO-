import java.util.Scanner;
public class Reel1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("donner a :");
		double a = sc.nextDouble();
		System.out.println("donner b :");
		double b = sc.nextDouble();
		System.out.println("donner c :");
		double c = sc.nextDouble();
		double s = a+b+c;
		double m = s/3;

		System.out.println("la somme de"+a+"et"+b+"et"+c+"="+s);
		System.out.println("la moyenne de" +a+"et"+b+"et"+c+"="+m);
	}
}
