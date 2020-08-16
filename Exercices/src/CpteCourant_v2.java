public class CpteCourant_v2 extends Cpte_v2 {
    /**
     * numero de compte (String)
     * Solde - lecture seule (double)
     * LigneDeCredit (double) - represente la limite négative du compte - strictement 0+
     * Titulaire Personne
     * ----------------------
     * retrait(double qtt)
     * depot(double qtt)
     */

    private double ligneCredit;

    public CpteCourant_v2(String numeroCompte, Personne titulaire, double ligneCredit) {
        super(numeroCompte, titulaire);
        this.ligneCredit = ligneCredit;
    }

    public double getLigneCredit() {
        return ligneCredit;
    }

    public void setLigneCredit(double ligneCredit) {
        this.ligneCredit = ligneCredit;
    }

    public void afficher() {
        System.out.println("Compte courant de " + getTitulaire().getNom() + " " + getTitulaire().getPrenom());
        System.out.println("Numero de compte : " + getNumeroCompte());
        System.out.println("Solde : " + getSolde());
        System.out.println("Ligne de crédit : " + getLigneCredit());
        System.out.println("----------------------------------------");
    }
    @Override
    public void retrait(Double montant) {
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
            System.out.println("montant negatif (retrait courant)");
        }

    }
}