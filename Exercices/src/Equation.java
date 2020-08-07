public class Equation {
    private double A;
    private double B;
    private double C;
    private double X1;
    private double X2;


    public Equation(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public boolean resoudre () {
        double discriminant = (B * B) - (4 * A * C);

        if (discriminant > 0 ) {
            X1 = (-B - Math.sqrt(discriminant)) / (2*A);
            X2 = (-B + Math.sqrt(discriminant)) / (2*A);
            System.out.println("X1 : " + X1);
            System.out.println("X2 : " + X2);
            return true;
        }

        if (discriminant == 0) {
            X1 = (-B) / (2*A);
            System.out.println("X1 : " + X1);
            return true;
        }

        System.out.println("solution impossible");
        return false;
    }
    public void afficherEquation() {
        System.out.println(A+"x²"+ " + " + B + "x + " + C);
    }

}
