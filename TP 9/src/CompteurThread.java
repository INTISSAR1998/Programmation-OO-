
public class CompteurThread extends Thread {
	  private String nom;
	  private int max;
	  // Temps de pause en millisecondes
	  private final static int PAUSE = 10000;

	  
	  public CompteurThread(String nom, int max) {
	    this.nom = nom;
	    this.max = max;
	  }

	  public CompteurThread(String nom) {
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
	  }
	  
	} // Compteur