import java.util.Scanner;

public class Ex05b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("premier nombre ? ");
        String nbA = sc.nextLine();
        System.out.println("deuxieme nombre ? ");
        String nbb = sc.nextLine();

        char[] A = nbA.toCharArray();
        int intA = 0;
        for (int i = A.length-1, j = 0; i>=0; i--, j++) {
            intA += ((A[j]-48) * Math.pow(10, i));
        }

        char[] B = nbb.toCharArray();
        int intB = 0;
        for (int i = B.length-1, j = 0; i>=0; i--, j++) {
            intB += ((B[j]-48) * Math.pow(10, i));
        }

        System.out.println(intA + intB);
    }
}
