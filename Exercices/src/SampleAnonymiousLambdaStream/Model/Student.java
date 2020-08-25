package SampleAnonymiousLambdaStream.Model;

import java.util.Objects;

public class Student {
    // Attributes
    private String nom;
    private String prenom;
    private int year;

    // Contructors
    public Student(String nom, String prenom, int year) {
        this.nom = nom;
        this.prenom = prenom;
        this.year = year;
    }

    public Student() {

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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    // Methods


    // Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year &&
                Objects.equals(nom, student.nom) &&
                Objects.equals(prenom, student.prenom);
    }

    @Override
    public int hashCode() { // renvoie un entier qui est l'instance de la classe - retour de DB
        return Objects.hash(nom, prenom, year);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", year=" + year +
                '}';
    }
}
