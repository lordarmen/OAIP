import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double eps = sc.nextDouble();

        double sum = 0;
        int i = 0;
        double fact = 1;

        while (true) {
            if (i > 0)
                fact *= i;

            double term = Math.pow(-2, i) / fact;

            if (Math.abs(term) < eps)
                break;

            sum += term;
            i++;
        }

        System.out.println(sum);
    }
}
