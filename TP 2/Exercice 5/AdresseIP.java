import java.util.Scanner;
public class AdresseIP {
	private int [] octet;
	public AdresseIP(){
		octet=new int [] {0,0,0,0};
	}
	public void setOctet(int i , int val){
		octet[i]=val;}
	public int getOctet(int i){
		return(octet[i]);
	}
	public String toString (){
	return(octet[0]+"."+octet[1]+"."+octet[2]+"."+octet[3]);	
	}
	
	public void saisieIP(){ 		
	Scanner c=new Scanner(System.in);
	boolean valide=false;
	while(!valide){
		System.out.println("donner une adresse IP");
	
	String adresse=c.nextLine();
	String resultat[]=adresse.split("\\.");
	
	for(int i=0;i<resultat.length;i++){	
	int val=Integer.parseInt(resultat[i]);
	if(val>=0 && val<=255 && resultat.length==4)
		{valide=true;
		 octet[i]=val;}
	else{valide=false;
		 System.out.println("IP non valide");
		 break;}
	    }
	}
	}
}
