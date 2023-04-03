package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Categorie;
import model.Produit;

public class BoutiqueManagement {
	EntityManager em; //variable globale

	public BoutiqueManagement() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persis");//persi:name de lxml
		em=factory.createEntityManager();
	}
public List<Produit> getAllProduit(){
	em.getTransaction().begin();// OUVRIR la connexion de la table
	Query q=em.createQuery("select p from Produit p ");//jib les produit
	List<Produit> result=q.getResultList();//
	em.getTransaction().commit();//fermer la connexion de la table 
	return result;
	
}
public List<Categorie> getAllCategorie(){
	em.getTransaction().begin();// OUVRIR la connexion de la table
	Query q=em.createQuery("select c from Categorie c");//jib les produit
	List<Categorie> result=q.getResultList();//
	em.getTransaction().commit();//fermer la connexion de la table 
	return result;
	
}

public List<Produit> getProduitByCategorie(int id){
	em.getTransaction().begin();// OUVRIR la connexion de la table
	Query q=em.createQuery("select p from Produit p where p.categorie.id= :dd");//jib les produit ml classe
	q.setParameter("dd", id); //ychouf chniya dd yal9aha id
	List<Produit> result=q.getResultList();//
	em.getTransaction().commit();//fermer la connexion de la table 
	return result;
}
public Produit getProduitById(int id) {
	em.getTransaction().begin();
	Produit p=em.find(Produit.class, id);
	em.getTransaction().commit();
	return p;
	
}
}