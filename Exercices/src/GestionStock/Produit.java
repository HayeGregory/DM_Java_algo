package GestionStock;

public abstract class Produit {

    // attributes
    private String nom = "nom par defaut";
    private Double prix = 0d;

    // constructor
    public Produit(String nom, double prix) {
        setNom(nom);
        setPrix(prix);
    }

    // getters - setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (!nom.isEmpty()) {
            this.nom = nom;
        } else {
            System.out.println("nom du produit par defaut");
        }
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        if (prix >= 0 ) {
            this.prix = prix;
        } else {
            System.out.println("Pas de produit prix negatif - prix mis a 0");
        }
    }

    // methods
    public abstract void utiliser();

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(" [ ")
                .append("Nom : " + getNom() + " ")
                .append("Prix : " + getPrix() + " ] ");


        return sb.toString();
    }
}
