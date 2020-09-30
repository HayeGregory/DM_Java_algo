package test_interface;

public class Personne implements IInterfaceA, IinterfaceB {
    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public static  void main() {
        System.out.println(IInterfaceA.x + " " + IinterfaceB.x);
       /* System.out.println(x);*/

        int[] tab = {1,2,3,4,5,6,7,8,9};

        for (int i : tab) {
            if (i == 5) {
                i = 55;
            }

        }
        for (int i : tab) {
            System.out.println(i);
        }
    }

    @Override
    public void test() {

    }
}
