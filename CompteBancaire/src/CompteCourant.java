public class CompteCourant extends CompteBancaire {
    double limit_retrait;
    public void retirer(float mt){
        if(getSolde()-mt>= limit_retrait) this.setSolde(this.getSolde()-mt);
    }
}
