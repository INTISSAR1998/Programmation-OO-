
import java.util.Scanner;
public class Calculette {

	public double plus (double a,double b){
    	if(b!=0)
    		return a+b;
    	else
    		return 0 ;
    }
    public double moins(double a,double b){
    	if(b!=0)
    		return a-b;
    	else
    		return 0 ;
    }
    public double fois (double a,double b){
    	if(b!=0)
    		return a*b;
    	else
    		return 0 ;
    }
    public double div (double a,double b){
    	if(b!=0)
    		return a/b;
    	else
    		return 0 ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculette T=new Calculette();
    Scanner sc=new Scanner(System.in);
    double v1,v2;
    char op;
    // ne pas oublier de saisir les valeurs de v1,v2 et op
    System.out.println("donner l'opérande v1");
    v1=sc.nextDouble();
    System.out.println("donner l'opérande v2");
    v2=sc.nextDouble();
    System.out.println("donner l'opération de calcul");
    op=sc.next().charAt(0);
    switch(op){
    case'+' : System.out.println(T.plus(v1, v2));break;
    case'-' : System.out.println(T.moins(v1, v2));break;
    case'*' : System.out.println(T.fois(v1, v2));break;
    case'/' : if(v2==0){System.out.println("division par zéro");break;}
    			else {System.out.println(T.div(v1, v2));break;}
    default : System.out.println ("opération inconnue");
    }
	}
}
