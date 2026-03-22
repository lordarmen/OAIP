public class Program15 {
    public static void main(String[] args) {

        double A = 2;
        double B = 5;
        double C = 8;

        boolean increasing = (A < B && B < C);
        boolean decreasing = (A > B && B > C);

        if (increasing || decreasing) {
            A *= 2;
            B *= 2;
            C *= 2;
        } else {
            A = -A;
            B = -B;
            C = -C;
        }

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
    }
}
