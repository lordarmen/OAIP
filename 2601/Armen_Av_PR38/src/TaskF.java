import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double eps = sc.nextDouble();

        double sum = 0;
        int i = 0;

        while (true) {
            double term = 1.0 / (Math.pow(4, i) + Math.pow(5, i + 2));

            if (term < eps)
                break;

            sum += term;
            i++;
        }

        System.out.println(sum);
    }
}
