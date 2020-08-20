package GestionCompteBancaire.Interface;

public interface IClient {

    double recupererSolde();
    void effectuerDepot(double montant);
    boolean effectuerRetrait(double montant);

}
