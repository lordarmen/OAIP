public class Program26 {
    public static void main(String[] args) {

        int n = -8;
        String result = "";

        if (n == 0) {
            result = "нулевое число";
        }
        else {

            if (n > 0)
                result += "положительное ";
            else
                result += "отрицательное ";

            if (n % 2 == 0)
                result += "четное число";
            else
                result += "нечетное число";
        }

        System.out.println(result);
    }
}
