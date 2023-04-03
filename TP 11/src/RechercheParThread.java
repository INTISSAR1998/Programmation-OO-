
import java.util.Random;

public class RechercheParThread extends Thread {
	long t[];
	long elt ;
	int debut , fin ;
	
	public  RechercheParThread (long[] tab , long e ,  int d , int f) {
		this.t = tab ;
		this.elt = e ;
		this.debut = d ;
		this.fin = f ;
	}
	
	 public void run() { 
		 String ch="element n'existe pas " ;
		 int i ;
		 System.out.println("Recheche dans "+t+" de "+debut+ " à "+fin);
		 try {
			 for (i=debut ; i<fin ; i++) 
				if (elt == t[i]) {
					ch="existe dans indice :"+i ;
					break;
				}
			 System.out.println(ch);
			 
		 }catch(Exception e) {
			 System.out.println(e);
		 }	 
		 		
	 }
	 
	public static void main(String[] args) {
		Random r = new Random();
		long [] t1 = new long[2000000];
		int e=0 ;
		int de =0 ;
		int fn = 200000;
		for(int i=0 ; i < t1.length ; i++ ) {
				  t1[i] =r.nextInt(100000)*r.nextInt(100000);
				 
		 }
		//System.out.print("main : "+t1);
		RechercheParThread [] RTH = new RechercheParThread[10] ;
			    
			    for (int j = 0; j < RTH.length; j++)
			    {
			    	RTH[j] = new RechercheParThread(t1,e , fn*j, fn*(j+1)) ;
			        RTH[j].start();
			        
			      }  
			   
	}
		

}

