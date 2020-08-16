import java.time.LocalDate;

public class Ex09 {
    public static void main(String[] args) {

        Personne t1 = new Personne("Haye", "Gregory", LocalDate.of(1979,06,14));

        CpteCourant_v2 cc = new CpteCourant_v2("99999", t1, 50000);
        CpteEpargne_v2 ce = new CpteEpargne_v2("zzzzzz", t1, null);

        cc.afficher();
        ce.afficher();

        cc.depot(1000d);
        ce.depot(1000d);

        cc.afficher();
        ce.afficher();

        cc.retrait(50000d);
        ce.retrait(500d);

        cc.afficher();
        ce.afficher();



    }
}
