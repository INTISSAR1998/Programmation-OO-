/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooavancee;

/**
 *
 * @author Rania
 */
public class POOAvancee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Compteur a = new Compteur("Alex");
      Compteur b =new Compteur("Ahmed");
      Compteur c =new Compteur("Mohamed");
     
      a.start();
     // try {
        //  a.join();
     // } catch (InterruptedException e )
      { }
      b.start();
      //  try {
       //   b.join();
     // }// catch (InterruptedException e )
      { }
      c.start();
      // avec thread impl runnable
     // Compteur r = new Compteur("Bruno");
     // Thread r1 = new Thread(r);
     // r.start();
     
    }
  }
    
    

