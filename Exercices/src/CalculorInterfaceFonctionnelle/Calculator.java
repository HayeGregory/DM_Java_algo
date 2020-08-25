package CalculorInterfaceFonctionnelle;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Calculator {
    private static HashMap<String, BinaryOperator<Double>> operations = new HashMap<String, BinaryOperator<Double>>();
    private static Scanner sc = new Scanner(System.in);

    public static void start() {
        initOperation();
        String choice = null;

        do {
            choice = menu();
            switch(choice)
            {
                case "1": calculate(); break;
                case "2": System.exit(0); break;
                default:System.out.println("Really? You just have to select 1 or 2!"); break;
            }
        }while(true);
    }

    private static String menu() {
        System.out.println("********************");
        System.out.println("*      M E N U     *");
        System.out.println("********************");
        System.out.println("* 1. Calculate     *");
        System.out.println("* 2. Exit          *");
        System.out.println("********************");
        System.out.print("* Choice: ");

        return sc.nextLine();
    }
    private static void initOperation(){
        operations.put( "+", (x,y) -> x + y );
        operations.put( "-", (x,y) -> x - y );
        operations.put( "/", (x,y) -> {
                return y == 0 ? Double.POSITIVE_INFINITY : x / y ;
            });
        operations.put( "*", (x,y) -> x * y );
        operations.put( "%", (x,y) -> {
                return y == 0 ? Double.NaN : x / y;
            });

    }
    private static void calculate(){
        //todo
        System.out.print("Premier membre : ");
        double A = Double.parseDouble(sc.nextLine());

        System.out.print("Deuxieme membre : ");
        double B = Double.parseDouble(sc.nextLine());

        System.out.print("Opérations [ + - * / % ] : ");
        String op = sc.nextLine();
        BinaryOperator<Double> choice = operations.get(op);

        if (choice != null)
            try {
                System.out.println("" + A + " " + op + " " + B + " = " + choice.apply(A, B));
            } catch (ArithmeticException e) {
                System.out.println("Division par zero");
            }

        else
            System.out.println("Operation impossible");


    }
}
