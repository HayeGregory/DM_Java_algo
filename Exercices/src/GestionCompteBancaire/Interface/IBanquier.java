package GestionCompteBancaire.Interface;

import GestionCompteBancaire.Model.*;

public interface IBanquier extends IClient {

    void appliquerInteret(Compte cpte);
    Personne recupererTitulaire(Compte cpte);
    String recupererNumeroCompte(Compte cpte);
}
