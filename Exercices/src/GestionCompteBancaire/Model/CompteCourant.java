package GestionCompteBancaire.Model;

public class CompteCourant extends Compte {
    private double ligneCredit = 0;

    public CompteCourant(String numero, double ligneCredit, Personne titulaire) {
        this.setNumero( numero );
        this.setLigneCredit( ligneCredit );
        this.setTitulaire( titulaire );
    }

    // methods

    @Override
    protected double calculerInteret() {
        return getSolde() * (getSolde() >= 0 ? 0.03 : 0.0975) ;
    }

    @Override
    public void retrait(double qtt) {
        if( getSolde() - qtt >= -getLigneCredit() )
            super.retrait(qtt);
        else
            System.out.println("fond insuffisant");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\t - ligne de credit : " + this.getLigneCredit() + '\n';
    }

    // Get/Set

    public double getLigneCredit() {
        return ligneCredit;
    }

    public void setLigneCredit(double ligneCredit) {
        if( ligneCredit >= 0 )
            this.ligneCredit = ligneCredit;
    }

    @Override
    public void appliquerInteret(Compte cpte) {

    }

    @Override
    public Personne recupererTitulaire(Compte cpte) {
        return null;
    }

    @Override
    public String recupererNumeroCompte(Compte cpte) {
        return null;
    }

    @Override
    public double recupererSolde() {
        return 0;
    }

    @Override
    public void effectuerDepot(double montant) {

    }

    @Override
    public boolean effectuerRetrait(double montant) {
        return false;
    }
}
