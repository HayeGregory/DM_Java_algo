import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /* exoOpeArithm.txt */

        Scanner sc = new Scanner(System.in);

        System.out.println("le premier entier ? ");
        String a = sc.nextLine();
        int nbA = Integer.parseInt(a);
        System.out.println("le deuxieme entier ? ");
        String b = sc.nextLine();
        int nbB = Integer.parseInt(b);

        System.out.println("division entière " + nbA / nbB);
        System.out.println("Modulo : " + nbA % nbB);
        System.out.println("division : " + (double)nbA/nbB);

        sc.close();
    }
}
