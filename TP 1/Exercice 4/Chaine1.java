import java.util.Scanner;
public class Chaine1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("donner a :");
		String a = sc.nextLine();
		System.out.println("donner b :");
		String b = sc.nextLine();
		System.out.println("donner c :");
		String c = sc.nextLine();
		System.out.println("la chaine complete est:" +a+b+c);
		System.out.println("la chaine complete est:" +c+b+a);
	}
}
