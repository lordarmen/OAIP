public class Program32 {
    public static void main(String[] args) {

        int N = 20;

        int sum = 0;
        int K = 0;

        while (sum < N) {
            K++;
            sum += K;
        }

        System.out.println("K = " + K);
        System.out.println("Сумма = " + sum);
    }
}
