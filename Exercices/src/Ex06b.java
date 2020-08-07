import java.util.Scanner;

public class Ex06b {
    public static void main(String[] args) {
        String nbrA = recupererNombre();
        int a = convertir(nbrA);
        int b = convertirMirroir(nbrA);

        addition(a, b);
    }

    static String recupererNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre : ");
        String nbr = scanner.next();
        //scanner.close();
        return nbr;
    }
    static int convertir( String nombre) {
        int n = 0;
        char[] tabCar = nombre.toCharArray();

        for (char c : tabCar) {
            n =( n*10 ) + c - 48;
        }
        return n;
    }

    static int convertirMirroir(String nombre){
        String inverse = "";

        for (int i = nombre.length()-1; i >= 0; i--) {
            inverse += nombre.charAt(i);
        }
        return convertir(inverse);
    }

    static int addition (int a, int b) {
        System.out.println( a +" + " + b + " = " + (a+b));
        return a + b;
    }

}
