package GestionStock;

public class ProduitBeaute extends Produit implements Echangeable{

    // attributes
    private String categorieBeaute;

    // constructor
    public ProduitBeaute(String nom, double prix, String categorieBeaute) {
        super(nom, prix);
        this.categorieBeaute = categorieBeaute;
    }

    // getters - setters
    public String getCategorieBeaute() {
        return categorieBeaute;
    }

    public void setCategorieBeaute(String categorieBeaute) {
        this.categorieBeaute = categorieBeaute;
    }

    @Override
    public void utiliser() {
        System.out.println("j'utilise mon produit de beaute : " + this.getNom());
        echanger();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("(categorie beaute : " + getCategorieBeaute() + ")");

        return sb.toString();
    }

    @Override
    public void echanger() {
        System.out.println("je suis un produit echangeable d'une valeur de : " + this.getPrix() );
    }
}
