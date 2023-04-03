public class Banque {
    public static void main(String[] args) {
        CompteCourant cc1 = new CompteCourant(),cc2 = new CompteCourant(),cc3 = new CompteCourant();
        CompteEpargne ce1 = new CompteEpargne(),ce2 = new CompteEpargne(),ce3 = new CompteEpargne();
        ComptePayant cp1 = new ComptePayant(),cp2 = new ComptePayant(),cp3 = new ComptePayant();
        Class<?> tab[9]=[cc1,cc2,cc3,ce1,ce2,ce3,cp1,cp2,cp3];
        for (Class<?> t:
             tab) {

        }
    }
}
