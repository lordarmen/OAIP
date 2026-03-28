public class Program25 {
    public static void main(String[] args) {

        double x = 2;
        double y = 3;
        double R = 5;

        double value = x*x + y*y;

        if (value < R*R)
            System.out.println("Да");
        else if (value > R*R)
            System.out.println("Нет");
        else
            System.out.println("На границе");
    }
}
