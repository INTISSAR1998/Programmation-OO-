package Exercice3;

public class Test {
	
	public static void main( String []args){

		try{
		Toutou t= new Toutou ("milou", 4);
			 System.out.println (t);
		}
		catch  ( IllegalArgumentException e){ 
			System.out.println ( "toutou raté:"+e);
		}
		try{
		Toutou t1= new Toutou (null, 5);
			 System.out.println (t1);
		}
		catch  ( IllegalArgumentException e1){ 
			System.out.println ( "toutou raté:"+e1);
		}
		try{
		Toutou t2= new Toutou ("medor", -11);
			 System.out.println (t2);
		}
		catch  ( IllegalArgumentException e2){ 
			System.out.println ( "toutou raté:"+e2);
		}
	}	
}
