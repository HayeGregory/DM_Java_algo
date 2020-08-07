import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nombreLong = 1_000_000;     // _ astuce separateur visuel pour nombre long
        int nbA = sc.nextInt();
        int nbB = sc.nextInt();

        System.out.println(nbA + "---" + nbB);

        sc.close();

    }
}
