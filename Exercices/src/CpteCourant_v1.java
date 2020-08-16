public class CpteCourant_v1 {
    /**
     * numero de compte (String)
     * Solde - lecture seule (double)
     * LigneDeCredit (double) - represente la limite négative du compte - strictement 0+
     * Titulaire Personne
     * ----------------------
     * retrait(double qtt)
     * depot(double qtt)
     */
    private String numeroCompte;
    private double solde = 0;
    private double ligneCredit = 0;
    private Personne titulaire;

    // Constructor
    public CpteCourant_v1(String numeroCompte, double ligneCredit, Personne titulaire) {
        setNumeroCompte(numeroCompte);
        setLigneCredit(ligneCredit);
        setTitulaire(titulaire);
    }
    public CpteCourant_v1(String numeroCompte, Personne titulaire) {
        this(numeroCompte, 0, titulaire);
    }

    // Getters - Setters
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        if (solde >= - ligneCredit)
            this.solde = solde;
    }

    public double getLigneCredit() {
        return ligneCredit;
    }

    public void setLigneCredit(double ligneCredit) {
        if (ligneCredit >= 0)
            this.ligneCredit = ligneCredit;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    // Methods
    public void retrait (double montant) {
        if ( montant > 0) {
            if ( (getSolde() + getLigneCredit()) - montant >= 0) {
                setSolde(getSolde()- montant);
            } else {
                System.out.println("Solde insuffisant - solde : "
                        + getSolde()
                        + "ligne de credit : "
                        + getLigneCredit());
            }
        } else {
            System.out.println("montant negatif (retrait)");
        }

    }
    public void depot (double montant) {
        if ( montant > 0 ) {
            setSolde(getSolde() + montant);
        }else {
            System.out.println("montant negatif (depot)");
        }
    }
    public void afficher() {
        System.out.println("Compte courant de " + getTitulaire().getNom() + " " + getTitulaire().getPrenom());
        System.out.println("Numero de compte : " + getNumeroCompte());
        System.out.println("Solde : " + getSolde());
        System.out.println("Ligne de crédit : " + getLigneCredit());
        System.out.println("----------------------------------------");
    }

    @Override
    public String toString() {
        return "CpteCourant{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + solde +
                ", ligneCredit=" + ligneCredit +
                ", titulaire=" + titulaire +
                '}';
    }
}