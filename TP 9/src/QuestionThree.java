
public class QuestionThree extends Thread {
	  private String nom;
	  private int max;
	  // Temps de pause en millisecondes
	  private final static int PAUSE = 10000;

	  public QuestionThree(String nom, int max) {
	    this.nom = nom;
	    this.max = max;
	  }

	  public QuestionThree(String nom) {
	    this(nom, 10);
	  }

	  public void run() {
	    for (int i = 1; i <= max; i++) {
	      try {
	        sleep((int)(Math.random() * PAUSE));
	      } 
	      catch(InterruptedException e) {
	        System.err.println(nom + " a ete interrompu.");
	      }
	      System.out.println(nom + " : " + i);
	    }
	    System.out.println("*** " + nom + " a fini de compter jusqu'à " + max);
	  }

	  public static void main(String[] args) {
	    CompteurThread[] compteurs = {
	      new CompteurThread("Cpt1"),
	      new CompteurThread("Cpt2"),
	      new CompteurThread("Cpt3")
	    };
	    for (int i = 0; i < compteurs.length; i++) {
	      compteurs[i].start();
	    }
	    QuestionThree c1 = new QuestionThree("Cpt1");
	    QuestionThree c2 = new QuestionThree("Cpt2") ;
	    QuestionThree c3 = new QuestionThree("Cpt3");
	      
	     
	    try {
	     c1.start();
	     c1.join();
	     c2.start();
	     c2.join();
	     c3.start();
	     c3.join();
	      } catch(InterruptedException e) {
	    	  System.err.println(e.getMessage());
	      }
	  }
	  
} 