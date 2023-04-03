package ex1;
public class Produit{
    private String nom;
    private double prix_achat;
    private double prix_vente;
    private int quantite;
    public Produit (String nom,double prix_achat,double prix_vente){
        this.nom=nom;
        this.prix_achat=prix_achat;
        this.prix_vente=prix_vente;
        this.quantite=0;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return(nom);
    }
    public void setprix_achat(double prix_achat){
        this.prix_achat=prix_achat;
    }
    public double getprix_achat(){
        return(prix_achat);
    }
    public void setprix_vente(double prix_vente){
        this.prix_vente=prix_vente;
    }
    public double getprix_vente(){
        return(prix_vente);
    }
    public void setQuantite(int quantite){
        this.quantite=quantite;
    }
    public int getQuantite(){
        return(quantite);
    }
    public void getString() {

    }
    public String toString(){
        return("produit:\n Nom:"+nom+"\n prix_achat:"+prix_achat+"\n prix_vente:"+prix_vente+"\n Quantite:"+quantite);
    }
}


