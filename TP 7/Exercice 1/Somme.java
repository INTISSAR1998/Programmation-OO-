package Exercice1;
import java.util.Scanner;
public class Somme {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] ch=new String[5];
		for(int i=0;i<ch.length;i++)
			ch[i]=sc.nextLine();
	 int s=0;
	    for (int i=0; i<ch.length; i++)
	    	try
	    {
	    	s+= Integer.parseInt(ch[i]);
	    }
		catch (NumberFormatException e)
	    {
	    System.out.println("erreur Format");
	    }
	 
	    System.out.println("la somme est :"+s);
	}
}
