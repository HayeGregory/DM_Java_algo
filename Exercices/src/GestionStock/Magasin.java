package GestionStock;

import java.util.HashMap;
import java.util.Map;

public class Magasin {

    // attributes
    private String nomCompletMagasin;
    private HashMap<Produit, Integer > stock;

    // constructor
    public Magasin(String nomCompletMagasin) {
        setNomCompletMagasin(nomCompletMagasin);
        this.stock = new HashMap<>();
    }
    // Getters - setters
    public String getNomCompletMagasin() {
        return nomCompletMagasin;
    }

    public void setNomCompletMagasin(String nomCompletMagasin) {
        this.nomCompletMagasin = nomCompletMagasin;
    }

    public HashMap<Produit, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<Produit, Integer> stock) {
        this.stock = stock;
    }

    // methods
    public void ajouterProduit (Produit p) {
        if (!stock.containsKey(p)) {
            stock.put(p, 1);
        } else {
            stock.replace(p , stock.get(p)+1);
        }
    }
    public boolean retirerProduit (Produit p) {
        if (!stock.containsKey(p)) {
            System.out.println("le produit : " + p.getNom() + " n'est pas disponible dans ce magasin");
            return false;
        } else {
            if (stock.get(p) == 0) {
                System.out.println("le produit : " + p.getNom() + " n'est plus disponible [stock == 0]");
                return false;
            }
        }

        stock.replace(p, stock.get(p) - 1);
        return true;
    }

    public boolean produitEnStock (Produit p) { return (stock.get(p)!=null && stock.get(p) > 0); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[ Info Magasin : ")
                .append("Nom : " + getNomCompletMagasin() + " ]")
                .append("\nStock des produits : \n");

        for(Map.Entry m : getStock().entrySet()){
            sb.append(" - " +m.getKey());
            sb.append("   == > Quantite en stock : " + m.getValue() + "\n");
        }

        return sb.toString();
    }
}
