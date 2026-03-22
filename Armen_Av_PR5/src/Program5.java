public class Program5 {
    public static void main(String[] args) {

        double A1 = 2;
        double B1 = 3;
        double C1 = 13;

        double A2 = 1;
        double B2 = -1;
        double C2 = 1;

        double D = A1 * B2 - A2 * B1;

        if (D == 0) {
            System.out.println("Система не имеет единственного решения");
        } else {

            double x = (C1 * B2 - C2 * B1) / D;
            double y = (A1 * C2 - A2 * C1) / D;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}