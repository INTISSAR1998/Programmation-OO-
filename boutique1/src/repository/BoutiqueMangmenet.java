package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Categorie;
import model.Produit;

public class BoutiqueMangmenet {
	EntityManager em;
	public BoutiqueMangmenet()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persis");
	em =factory.createEntityManager();
	}
public List <Produit> getAllProduit(){
	em.getTransaction().begin();
	Query q=em.createQuery("select p from Produit p");
	List <Produit> result=q.getResultList();
	em.getTransaction().commit();
	return result;
	
}
public List <Categorie> getAllCategorie(){
	em.getTransaction().begin();
	Query q=em.createQuery("select p from Categorie p");
	List <Categorie> result=q.getResultList();
	em.getTransaction().commit();
	return result;
	
}
public List <Produit> getProduitBycategorie(int id){
	em.getTransaction().begin();
	Query q=em.createQuery("select p from Produit p where p.categorie.id = :dd");
	q.setParameter("dd",id);
	List <Produit> result=q.getResultList();
	em.getTransaction().commit();
	return result;
}
public Produit getProduitByID(int id)
{
	em.getTransaction().begin();
	Produit p =em.find(Produit.class,id);
	em.getTransaction().commit();
	return p;
}
}
