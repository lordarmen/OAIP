public class Program16 {
    public static void main(String[] args) {

        double x = 1.0;
        double y;

        if (x > -Math.PI/2 && x < Math.PI/2) {

            double value = (Math.sin(x) + Math.pow(Math.tan(x), 2))
                    / (3.5 * Math.cos(x));

            y = Math.sqrt(Math.abs(value));

        } else if (x > Math.PI/2 && x < Math.PI) {

            y = Math.cos(x / 3)
                    / (Math.sin(x) + Math.pow(Math.tan(x), 2));

        } else {

            System.out.println("x вне области определения");
            return;
        }

        System.out.println("y = " + y);
    }
}
