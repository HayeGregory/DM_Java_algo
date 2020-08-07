import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;

        /* fibonacci */
        System.out.println("suite de fibo (25) : ");
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < 25; i++) {
            if (i == 0) System.out.print(a + " ");
            if (i == 1) System.out.print(b + " ");
            if (i > 1) {
                c = a + b;
                a = b;
                b = c;
                System.out.print((c) + " ");
            }
        }
        System.out.println();

        /* Factorielle */
        int f = 0, result = 1;
        System.out.println("factorielle : ");
        System.out.println(" factorielle de : ");
        user = sc.nextLine();
        f = Integer.parseInt(user);
        System.out.println(" user : " + f);

        if (f < 0 )
            System.out.println("factorielle negative - erreur");
        else
            if (f == 0 || f == 1 )
                System.out.println(1);
            else {
                for (int i = 2; i <= f ; i++) {
                    result *= i;
                }
            }
        System.out.println(result);

        /* nombre premier */
        int np;
        boolean is_np;
        System.out.println("nombre premiers ");
        System.out.println(" x nombre premiers ? ");
        user = sc.nextLine();
        np = Integer.parseInt(user);
        for (int i = 2; i <= np ; i++) {
            is_np = true;
            for (int j = 2; j < i ; j++) {
                if( i % j == 0) is_np = false;
            }
            if (is_np) System.out.print( i + " ");
        }

        /* table de multiplication */
        System.out.println("\ntable de multiplication : ");
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 0; j <= 20; j++) {
                System.out.print( (i*j) + " ");
            }
            System.out.println();
        }

    }
}
