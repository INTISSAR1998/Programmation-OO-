package partie2;

public class Profil {
	private int id;
	private String code;
	private String libelle;
	static int cpt;
	public Profil(String c,String l ){
		cpt++;
		id=cpt;
		code=c;
		libelle=l;
	}
	public String getCode(){
		return code;
	}
	public  String getLibelle(){
		return libelle;
	}
}
