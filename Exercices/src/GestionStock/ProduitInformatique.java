package GestionStock;

public class ProduitInformatique extends Produit implements Remboursable, Echangeable{

    // attributes
    private String categorieDevice;

    // constructor
    public ProduitInformatique(String nom, double prix, String categorieDevice) {
        super(nom, prix);
        this.categorieDevice = categorieDevice;
    }

    // getters - setters
    public String getCategorieDevice() {
        return categorieDevice;
    }

    public void setCategorieDevice(String categorieDevice) {
        this.categorieDevice = categorieDevice;
    }

    @Override
    public void utiliser() {
        System.out.println("j'utilise mon produit informatique");
        echanger();
        rembourser();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("(categorie beaute : " + getCategorieDevice() + ")");

        return sb.toString();
    }

    @Override
    public void echanger() {
        System.out.println("je suis un prosuit echangeable (2)" + this.getNom());
    }

    @Override
    public void rembourser() {
        System.out.println("je suis un produit remboursable (2) d'une valeur de " + getPrix());
    }
}
