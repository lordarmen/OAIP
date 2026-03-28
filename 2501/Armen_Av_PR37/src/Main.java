import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a = ");
        String aa = in.nextLine();
        System.out.print("Введите b = ");
        String bb = in.nextLine();

        try {
            int a = Integer.parseInt(aa);
            int b = Integer.parseInt(bb);
            System.out.println(Calc.calc(a,b));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Введено неверное число!");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
            System.out.println("Запустите программу заново!");
        }
    }
}
