import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double eps = sc.nextDouble();

        double sum = 0;
        int i = 1;

        while (true) {
            double term = 1.0 / (i * i);

            if (term < eps)
                break;

            sum += term;
            i++;
        }

        System.out.println(sum);
    }
}
