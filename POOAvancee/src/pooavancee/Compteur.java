package pooavancee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Thread;

/**
 *
 * @author Rania
 */
class Compteur extends Thread{
     private String nom;

    public Compteur(String nom) {
        this.nom = nom;
    }
     public void run() {
    for (int i = 1; i <= 100; i++) {
      /*try {
        sleep((int)(Math.random() * 1));
      } 
      catch(InterruptedException e) {
      }*/
      System.out.println(nom + " : " + i);
      if(i%2 ==0) yield();
    }
    System.out.println("*** " + nom + " a fini de compter jusqu'à 10" );
  }
    
}
