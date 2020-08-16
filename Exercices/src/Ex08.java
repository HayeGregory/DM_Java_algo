import java.time.LocalDate;

public class Ex08 {

    public static void main(String[] args) {
        Personne t1 = new Personne("Haye", "Gregory", LocalDate.of(1979,6,14));

        CpteCourant_v1 cc1 = new CpteCourant_v1("012345678901", 1000, t1);

        System.out.println(t1);
        cc1.afficher();
        cc1.depot(1000);

        cc1.afficher();
        cc1.retrait(1001);

        cc1.afficher();
    }
}
