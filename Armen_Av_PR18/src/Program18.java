public class Program18 {
    public static void main(String[] args) {

        double x = 3;
        double y = 4;
        double R = 5;

        double value = x*x + y*y;

        if (value < R*R) {
            System.out.println("Да");
        }
        else if (value > R*R) {
            System.out.println("Нет");
        }
        else {
            System.out.println("На границе");
        }
    }
}