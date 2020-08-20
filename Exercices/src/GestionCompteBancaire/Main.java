package GestionCompteBancaire;

import GestionCompteBancaire.Model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("graque","titu", LocalDate.now());

        // epargne
        System.out.println("compte epargen : ");
        Compte Epargne = new CompteEpargne("001", p1);
        Epargne.afficher();

        Epargne.depot(10000);
        Epargne.afficher();

        Epargne.appliquerInteret();
        Epargne.afficher();

        // compte courant
        System.out.println("compte courant : ");
        CompteCourant courant = new CompteCourant("000", 10000, p1);

        courant.afficher();

        courant.appliquerInteret();
        courant.afficher();

        courant.depot(10000 );
        courant.appliquerInteret();
        courant.afficher();

        // test interet negatif
        System.out.println("test interet negatif");
        courant.retrait(12000);
        courant.afficher();
        courant.appliquerInteret();
        courant.afficher();


    }
}
