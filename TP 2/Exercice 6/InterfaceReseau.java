package ex6;



public class InterfaceReseau {
 private String nom;
 private String nature;
 private AdresseIP ip;
 private AdresseIP mr;
 public InterfaceReseau(String n, String nat ){
	 nom=n;
	 nature=nat;
	 ip=new AdresseIP();
	 ip.saisieIP();
	 mr=new AdresseIP();
	 mr.saisieIP();
 }
	public void setNOM(String n){
			nom=n;
	}
	public String getNom(){
			return(this.nom);
	}
	public void setNature(String nat){
			nature=nat;
	}
	public String getNature(){
			return(this.nature);
	}
	public void setIp(AdresseIP ip){
		ip=new AdresseIP();
		ip.saisieIP();
    }
	public AdresseIP getIP(){
		return(this.ip);
	}
	public void setMr(AdresseIP mr){
		mr=new AdresseIP();
		mr.saisieIP();
    }
	public AdresseIP getMr(){
		return(this.mr);
	}
	
	public String toString(){
		return"("+nom+","+nature+",["+ip.toString()+"],["+mr.toString()+"])";
	}
}
