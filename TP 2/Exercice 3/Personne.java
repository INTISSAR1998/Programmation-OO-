
public class Personne {

	private String nom;
	private int age;

		public Personne (String s,int a){
			nom=new String (s);
			age=a;
		}
		public Personne (String s){
			nom=s;
			age=0;
		}
		public Personne (){
		
		}
		public void setAge (int a){
			age=a;
		}
		public void setNom (String s){
			nom=s.toString();
		}
		public int getAge(){
			return(age);
		}
		public String getNom(){
			return(nom);
		}
		public String toString(){
			return("(*"+nom+","+age+"*)");
		}
}
