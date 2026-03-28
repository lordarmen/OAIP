public class Program36 {
    public static void main(String[] args) {

        int A = 48;
        int B = 18;

        while (B != 0) {

            int temp = B;
            B = A % B;
            A = temp;
        }

        System.out.println("НОД = " + A);
    }
}