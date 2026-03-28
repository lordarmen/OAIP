import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double eps = sc.nextDouble();

        double sum = 0;
        int i = 1;
        double fact = 1;

        while (true) {
            fact *= i;

            double term = Math.pow(-1, i) / fact;

            if (Math.abs(term) < eps)
                break;

            sum += term;
            i++;
        }

        System.out.println(sum);
    }
}