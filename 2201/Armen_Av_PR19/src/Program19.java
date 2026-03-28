public class Program19 {
    public static void main(String[] args) {

        int A = 20;
        int B = 15;
        int C = 4;

        int count = (A / C) * (B / C);

        int freeArea = A * B - count * C * C;

        System.out.println("Количество квадратов = " + count);
        System.out.println("Свободная площадь = " + freeArea);
    }
}
