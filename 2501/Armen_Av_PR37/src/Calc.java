import static java.lang.Math.pow;

public class Calc {
    static double calc(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("zero");
        }
        if (a > b){
            return (double) a * b - 3;
        } else if (a == b) {
            return 2;
        } else {
            if (a == 0) {
                throw new ArithmeticException("zero");
            }
            return (pow(a, 3) + 1) / b;
        }
    }
}
