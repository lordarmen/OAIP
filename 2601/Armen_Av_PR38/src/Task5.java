import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double a = 1;

        for (int k = 1; k <= n; k++) {
            a = k * a + 1.0 / k;
        }

        System.out.println(a);
    }
}
