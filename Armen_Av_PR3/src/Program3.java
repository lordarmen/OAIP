public class Program3 {
    public static void main(String[] args) {

        double V1 = 60;  // км/ч
        double V2 = 80;  // км/ч
        double S = 300;  // км
        double T = 2;    // часов

        double S2 = Math.abs(S - T * (V1 + V2));

        System.out.println("Скорость 1 = " + V1);
        System.out.println("Скорость 2 = " + V2);
        System.out.println("Начальное расстояние = " + S);
        System.out.println("Время = " + T);
        System.out.println("Расстояние через T часов = " + S2);
    }
}