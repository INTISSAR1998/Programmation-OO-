
public class Exercice1 {
	
    public static void main(String[] args) {
        int i ;
		  int n= 10;
		  try {
			  for(i=1;i<n ;i++)
			  {
		    System.out.println((n)/i);
			  }
		  } catch (ArithmeticException e) {
		    System.out.println("Division par zéro !");
		  }
		  System.out.println("");
		}

}