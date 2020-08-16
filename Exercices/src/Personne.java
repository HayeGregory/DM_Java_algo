import java.time.LocalDate;

public class Personne {
    /**
     * Nom
     * Prenom
     * DateNaissance ( LocalDate -- LocalDate.of()/ LocalDate.now )
     */

    private String nom;
    private String prenom;
    private LocalDate dateNaiss;

    // Constructor
    public Personne(String nom, String prenom, LocalDate dateNaiss) {
        setNom(nom);
        setPrenom(prenom);
        setDateNaiss(dateNaiss);
    }

    // Getters - Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaiss=" + dateNaiss +
                '}';
    }
}
