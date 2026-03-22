public class Program31 {
    public static void main(String[] args) {

        int N = 17;
        int K = 5;

        int quotient = 0;
        int remainder = N;

        while (remainder >= K) {
            remainder -= K;
            quotient++;
        }

        System.out.println("Частное = " + quotient);
        System.out.println("Остаток = " + remainder);
    }
}
