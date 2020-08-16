import java.time.LocalDate;

public class CpteEpargne_v2 extends Cpte_v2 {
    /*
    * numero
    * solde - lecture seule
    * titulaire
    * date dernier retrait ( .now
    * -------------
    * retrait (double)
    * depot (double)
    *
    * */

    private LocalDate dateDernierRetrait = null;

    public CpteEpargne_v2(String numeroCompte, Personne titulaire, LocalDate dateDernierRetrait) {
        super(numeroCompte, titulaire);
    }

    public LocalDate getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    private void setDateDernierRetrait(LocalDate dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

    public void afficher() {
        System.out.println("Compte courant de " + getTitulaire().getNom() + " " + getTitulaire().getPrenom());
        System.out.println("Numero de compte : " + getNumeroCompte());
        System.out.println("Solde : " + getSolde());
        System.out.println("Date dernier retrait : " + getDateDernierRetrait());
        System.out.println("----------------------------------------");
    }
    @Override
    public void retrait(Double montant) {
        if ( montant > 0) {
            if (getSolde() - montant >= 0) {
                setSolde(getSolde()- montant);
                setDateDernierRetrait(LocalDate.now());
            } else {
                System.out.println("Solde insuffisant - solde : "
                        + getSolde());
            }
        } else {
            System.out.println("montant negatif (retrait Epargne)");
        }
    }
}
