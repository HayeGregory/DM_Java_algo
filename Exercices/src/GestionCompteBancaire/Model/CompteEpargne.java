package GestionCompteBancaire.Model;

import GestionCompteBancaire.Exceptions.MontantNonValideException;
import GestionCompteBancaire.Exceptions.SoldeInsuffisantException;

import java.time.LocalDate;

public class CompteEpargne extends Compte{
    private LocalDate dateDernierRetrait;

    public CompteEpargne(String numero, Personne titulaire) {
        this.setNumero( numero );
        this.setTitulaire(titulaire);
    }

    // methods

    @Override
    protected double calculerInteret() {
        return getSolde() * 0.045;                   // return 4,5%
    }

    @Override
    public void retrait(double qtt) throws SoldeInsuffisantException{

        if( getSolde() - qtt >= 0 )
        {
            try {
                super.retrait(qtt);
            } catch (MontantNonValideException | SoldeInsuffisantException e) {
                System.out.println("### " + e.getMessage());
            }
            dateDernierRetrait = LocalDate.now();
        }
        else
            throw new SoldeInsuffisantException("Solde Client : " + getSolde());
            //System.out.println("fond insuffisant");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\t - dernier retrait : " +  ( dateDernierRetrait == null ? "---" : dateDernierRetrait )   + '\n';
    }


    // get/set


    public LocalDate getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    private void setDateDernierRetrait(LocalDate dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
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
