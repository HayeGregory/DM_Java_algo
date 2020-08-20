package GestionCompteBancaire.Model;

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
    public void retrait(double qtt) {

        if( getSolde() - qtt >= 0 )
        {
            super.retrait(qtt);
            dateDernierRetrait = LocalDate.now();
        }
        else
            System.out.println("fond insuffisant");
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
}
