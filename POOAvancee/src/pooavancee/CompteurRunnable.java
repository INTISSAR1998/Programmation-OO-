package pooavancee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rania
 */
public class CompteurRunnable implements Runnable {
    private String nom;
  
  public CompteurRunnable(String nom) {
    this.nom = nom;
  }


  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep((int)(Math.random() * 10000));
      } 
      catch(InterruptedException e) {
      }
      System.out.println(nom+ " : " + i);
    }
     System.out.println("*** " + nom + " a fini de compter jusqu'à 10" );
  }
    
}
