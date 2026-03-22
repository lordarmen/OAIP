public class Program23 {
    public static void main(String[] args) {

        double A = 1;
        double B = 3;
        double C = 5;

        boolean asc = (A < B && B < C);
        boolean desc = (A > B && B > C);

        if (asc || desc) {
            A *= 2;
            B *= 2;
            C *= 2;
        }
        else {
            A = -A;
            B = -B;
            C = -C;
        }

        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("C=" + C);
    }
}
