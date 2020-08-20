package GestionCompteBancaire.Model;

import GestionCompteBancaire.Exceptions.MontantNonValideException;
import GestionCompteBancaire.Exceptions.SoldeInsuffisantException;
import GestionCompteBancaire.Interface.IBanquier;
import GestionCompteBancaire.Interface.IClient;

import java.awt.dnd.InvalidDnDOperationException;

public abstract class Compte implements IBanquier, IClient {
    private String numero;
    private double solde = 0;
    private Personne titulaire;

    // methods

    protected abstract double calculerInteret();

    public void appliquerInteret () {
        setSolde(getSolde() +  calculerInteret());
    }

    public void retrait(double qtt) throws MontantNonValideException, SoldeInsuffisantException {
        if( qtt > 0 )
            setSolde( getSolde() - qtt );
        else
            throw new MontantNonValideException("param qqt : " + qtt);
            // System.out.println("qtt invalide");
    }

    public void depot(double qtt) throws MontantNonValideException
    {
        if( qtt > 0 )
            setSolde( getSolde() + qtt );
        else
            throw new MontantNonValideException("param qqt : " + qtt);
            // System.out.println("qtt invalide");

    }


    @Override
    public String toString() {
        return "compte ("+this.getNumero()+" - "+this.getTitulaire().getNom()+")" +
                "\n\t - solde : "+ this.getSolde();
    }

    public void afficher()
    {
        System.out.println( this );
    }

    // get/set

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }
}
