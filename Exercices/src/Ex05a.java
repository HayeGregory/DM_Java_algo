import java.util.Scanner;

public class Ex05a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de nombres premiers souhaitez vous?");
        int x = sc.nextInt();

        int[] tabPremier = new int[x];

        int premierPotentiel = 2;

        for (int indexPremier = 0; indexPremier < x; premierPotentiel++ ) {

            boolean premier = true;

            for( int i = 0; i < indexPremier && tabPremier[i] < premierPotentiel / 2 ; i++ )
            {
                if( premierPotentiel % tabPremier[i] == 0 )
                {
                    premier = false;
                    i = premierPotentiel;
                }
            }

            if(premier) {
                tabPremier[indexPremier] = premierPotentiel;
                indexPremier++;
            }
        }

        for (int element :
                tabPremier) {
            System.out.println(element);
        }

        sc.close();
    }
}
