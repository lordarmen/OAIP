public class Program12 {
    public static void main(String[] args) {

        double a = 1;
        double b = -3;
        double c = 2;

        double D = b * b - 4 * a * c;

        if (D >= 0) {
            System.out.println("Уравнение имеет решение");
        } else {
            System.out.println("Уравнение не имеет действительных решений");
        }
    }
}