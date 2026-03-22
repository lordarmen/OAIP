public class Program7 {
    public static void main(String[] args) {

        int N = 7384; // секунд

        int secondsInLastHour = N % 3600;
        int minutes = secondsInLastHour / 60;

        System.out.println("Прошло секунд = " + N);
        System.out.println("Полных минут с начала последнего часа = " + minutes);
    }
}