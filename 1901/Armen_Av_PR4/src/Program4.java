public class Program4 {
    public static void main(String[] args) {

        double x = 0.5;
        double g = 1.0;

        double y = x + Math.sqrt(Math.abs(1 - x * x));

        double numerator = Math.pow(Math.sin(x + g), 2) + Math.cos(x);
        double denominator = x + y + 2 * Math.log(Math.abs(x - y));

        double z = numerator / denominator;

        System.out.println("x = " + x);
        System.out.println("g = " + g);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
