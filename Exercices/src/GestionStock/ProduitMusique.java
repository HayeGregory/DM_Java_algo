package GestionStock;

public class ProduitMusique extends Produit {

    // attributes
    private String nomChanteur;

    // constructor
    public ProduitMusique(String nom, double prix, String nomChanteur) {
        super(nom, prix);
        setNomChanteur(nomChanteur);
    }

    // getters - setters
    public String getNomChanteur() {
        return nomChanteur;
    }

    public void setNomChanteur(String nomChanteur) {
        this.nomChanteur = nomChanteur;
    }

    @Override
    public void utiliser() {
        System.out.println("j'utilise mon produit audio");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("(categorie beaute : " + getNomChanteur() + ")");

        return sb.toString();
    }
}
