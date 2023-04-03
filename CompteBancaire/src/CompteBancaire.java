public class CompteBancaire {
    private int code;
    private double solde;

    // Getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    // Methods
    public void verser(float mt){
        solde += mt;
    }
    public void retirer(float mt){
        if(mt<solde) solde-=mt;
    }
    @Override
    public String toString() {
        return ("Le sole  actuel= "+this.solde);
    }
}
