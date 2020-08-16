public abstract class Cpte_v2 {

    private String numeroCompte;
    protected double solde = 0;
    private Personne titulaire;

    // Constructor
    public Cpte_v2(String numeroCompte, Personne titulaire) {
        setNumeroCompte(numeroCompte);
        setTitulaire(titulaire);
    }

    // Getters - setters
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    protected void setSolde(double solde) {
        this.solde = solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public abstract void retrait(Double montant);

    public void depot( Double montant) {
        if ( montant > 0 ) {
            setSolde(getSolde() + montant);
        }else {
            System.out.println("montant negatif (depot)");
        }
    }

}
