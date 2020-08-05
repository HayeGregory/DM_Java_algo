import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        /* BBANtoIBAN.txt */

        Scanner sc = new Scanner(System.in);
        long keyIban = 0;
        System.out.println("entrez le numero bban? ");
        String numBBan = sc.nextLine();

        if (numBBan.length() != 12) {
            System.out.println("Il faut 12 digits");
        } else {
            long partA = Long.parseLong(numBBan.substring(0,10));
            long partB  = Long.parseLong(numBBan.substring(10,12));

            if (partA % 97 == 0 && partB != 97)
                System.out.println("numero non valide (00)");
            else if (partA % 97 != 0 && partA % 97 != partB)
                System.out.println("numero non valide (97)");
            else {
                System.out.println("numero valide");
                keyIban = 98 - (Long.parseLong(numBBan + "111400") % 97); // 111400 = BE00
                System.out.println("key IBAN : " + keyIban);

                System.out.println("IBAN : " + "BE" +(keyIban < 10 ? "0": "" )  + keyIban + numBBan);
            }
        }
        sc.close();
    }
}
