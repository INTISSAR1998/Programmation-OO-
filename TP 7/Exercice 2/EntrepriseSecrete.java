package Exercice2;

public class EntrepriseSecrete extends Entreprise {
	public EntrepriseSecrete(String n, String m, int nbe, int c){
		super(n,m, nbe,c);
	}
	public String getMission() throws SecretMissionException {
		throw new SecretMissionException("Entreprise Misiion Secrete");
	}
}
