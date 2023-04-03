public class CompteEpargne extends CompteBancaire {
    double taux;
    public double SoldeDansXAnnees(int a){
        return this.getSolde()* java.lang.Math.pow(1+taux,a) ;
    }
}
