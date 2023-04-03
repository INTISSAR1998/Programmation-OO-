package ex1;

public class TestVille {


	public static void main(String[] args) {
		Ville v=new Ville("Mahdia",600000);
	    Capitale c=new Capitale("Tunis",2000000, new String [] {"mosquee zitouna","theatre carthage","palace bardo"});
	   
		System.out.println (v);
		System.out.println (c);
	}

}
