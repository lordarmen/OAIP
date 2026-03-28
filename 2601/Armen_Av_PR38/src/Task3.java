import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " кг = " + (i * price));
        }
    }
}