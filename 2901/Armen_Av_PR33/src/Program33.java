public class Program33 {
    public static void main(String[] args) {

        int N = 12345;
        int reversed = 0;

        while (N > 0) {

            reversed = reversed*10 + N%10;
            N /= 10;
        }

        System.out.println(reversed);
    }
}
