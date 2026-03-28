import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 3 == 0 && Math.abs(x) % 10 == 4) {
                sum += x;
            }
        }

        System.out.println(sum);
    }
}
