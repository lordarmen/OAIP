public class Program9 {
    public static void main(String[] args) {

        int K = 100; // день года

        int firstDay = 2; // вторник
        int dayOfWeek = (firstDay + K - 1) % 7;

        if (dayOfWeek == 0) {
            dayOfWeek = 7;
        }

        System.out.println("День года K = " + K);
        System.out.println("Номер дня недели = " + dayOfWeek);
    }
}
