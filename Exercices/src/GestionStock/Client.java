package GestionStock;

import java.util.ArrayList;

public class Client {

    // attributes
    private String nomCompletClient = "nom par defaut client";
    private double solde = 0;
    private ArrayList<Produit> produits;

    // Constructor
    public Client(String nomCompletClient, double solde) {
        setNomCompletClient(nomCompletClient);
        setSolde(solde);
        this.produits = new ArrayList<>();
    }

    // Getters - setters
    public String getNomCompletClient() {
        return nomCompletClient;
    }

    public void setNomCompletClient(String nomCompletClient) {
        if (!nomCompletClient.isEmpty()) {
            this.nomCompletClient = nomCompletClient;
        } else {
            System.out.println("nom client mis par defaut");
        }
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        } else {
            System.out.println("solde du client mis a 0");
        }
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public boolean acheter (Produit p, Magasin m) {
        if (m.produitEnStock(p)) {
            if (getSolde() - p.getPrix() >= 0) {
                produits.add(p);
                this.setSolde(getSolde() - p.getPrix());
                if ( m.retirerProduit(p) ) {
                    System.out.println("produit : " + p.getNom() + " acheté par [ " + getNomCompletClient()
                            +"] et retire du magasin : " + m.getNomCompletMagasin());
                    return true;
                } else {
                    System.out.println("error lors du retrait du produit - [ n'arrive normalement pas ]");
                }
            } else {
                System.out.println("solde insuffisant pour le client [ "+ getNomCompletClient() + "]");
            }
        } else {
            System.out.println("le produit n'est pas en stock / n'existe pas  dans le magasin pour le client [ "
                    + getNomCompletClient() + "]");
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Client : \n")
                .append("Nom client : " + getNomCompletClient() + "\n")
                .append("Solde : " + getSolde() + "\n")
                .append("Liste des produits : \n");

        for (Produit p : produits) {
            sb.append(p + "\n");
        }
        return sb.toString();
    }
}
