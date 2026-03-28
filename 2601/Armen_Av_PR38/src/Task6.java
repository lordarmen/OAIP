import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, K);
        }

        System.out.println(sum);
    }
}
