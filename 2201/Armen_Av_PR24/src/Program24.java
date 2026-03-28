public class Program24 {
    public static void main(String[] args) {

        double x = 1;
        double y;

        if (x > -Math.PI/2 && x < Math.PI/2) {

            y = Math.sqrt(Math.abs(
                    (Math.sin(x) + Math.pow(Math.tan(x),2))
                            /(3.5*Math.cos(x))
            ));

        }
        else if (x > Math.PI/2 && x < Math.PI) {

            y = Math.cos(x/3)
                    /(Math.sin(x)+Math.pow(Math.tan(x),2));

        }
        else {
            System.out.println("x вне области определения");
            return;
        }

        System.out.println("y = " + y);
    }
}
