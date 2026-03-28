public class Program21 {
    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 5;

        double D = b*b - 4*a*c;

        if (D >= 0)
            System.out.println("Уравнение имеет решение");
        else
            System.out.println("Действительных решений нет");
    }
}
