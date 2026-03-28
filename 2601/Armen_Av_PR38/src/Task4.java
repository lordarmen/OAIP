import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int n = sc.nextInt();

        double sum = 0;

        for (int k = 1; k <= n; k++) {
            sum += Math.pow(-1, k - 1) * Math.pow(x, k) / k;
        }

        System.out.println(sum);
    }
}
