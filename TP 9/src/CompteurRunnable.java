
public class CompteurRunnable implements Runnable {
	  private String nom;
	  private int max;
	  // Temps de pause en millisecondes
	  private final static int PAUSE = 5000;
	  
	  public CompteurRunnable(String nom, int max) {
	    this.nom = nom;
	    this.max = max;
	  }

	  public CompteurRunnable(String nom) {
	    this(nom, 10);
	  }

	  public String getNom() {
	    return nom;
	  }

	  public int getMax() {
	    return max;
	  }

	  public void run() {
	    for (int i = 1; i <= max; i++) {
	      try {
	        Thread.sleep((int)(Math.random() * PAUSE));
	      } 
	      catch(InterruptedException e) {
	        System.err.println(getNom() + " a ete interrompu.");
	      }
	      System.out.println(getNom() + " : " + i);
	    }
	    System.out.println("*** " + getNom() + " a termine.");
	  }

	  public static void main(String[] args) {
	    CompteurRunnable[] compteurs = {
	      new CompteurRunnable("Cpt1"),
	      new CompteurRunnable("Cpt2"),
	      new CompteurRunnable("Cpt3")
	    };
	    for (int i = 0; i < compteurs.length; i++) {
	      new Thread(compteurs[i]).start();
	    }
	  }
	  
	} // CompteurRunnable