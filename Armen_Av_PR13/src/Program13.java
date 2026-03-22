public class Program13 {
    public static void main(String[] args) {

        int number = -5;

        if (number > 0) {
            number -= 8;
        } else if (number < 0) {
            number += 6;
        } else {
            number = 10;
        }

        System.out.println("Результат = " + number);
    }
}
