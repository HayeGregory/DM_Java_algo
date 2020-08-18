package GestionStock;

public class ProduitBricolage extends Produit implements Remboursable{

    // attributes
    private String categorieBricolage;

    // constructor
    public ProduitBricolage(String nom, double prix, String categorieBricolage) {
        super(nom, prix);
        setCategorieBricolage(categorieBricolage);
    }

    // Getters - setters
    public String getCategorieBricolage() {
        return categorieBricolage;
    }

    public void setCategorieBricolage(String categorieBricolage) {
        this.categorieBricolage = categorieBricolage;
    }

    @Override
    public void utiliser() {
        System.out.println("j'utilise mon produit de bricolage : " + this.getNom());
        rembourser();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("(categorie beaute : " + getCategorieBricolage() + ")");

        return sb.toString();
    }

    @Override
    public void rembourser() {
        System.out.println("je suis un produit remboursable d'une valeur de " + getPrix());
    }
}
