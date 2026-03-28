import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double eps = sc.nextDouble();

        double sum = 0;
        int i = 1;

        while (true) {
            double term = Math.pow(-1, i + 1) / (i * (i + 1) * (i + 2));

            if (Math.abs(term) < eps)
                break;

            sum += term;
            i++;
        }

        System.out.println(sum);
    }
}
