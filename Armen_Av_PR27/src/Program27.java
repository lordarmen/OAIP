public class Program27 {
    public static void main(String[] args) {

        int n = 248;
        String result = "";

        if (n < 1 || n > 999) {
            System.out.println("Число вне диапазона");
            return;
        }

        if (n % 2 == 0)
            result += "четное ";
        else
            result += "нечетное ";

        if (n < 10)
            result += "однозначное число";
        else if (n < 100)
            result += "двузначное число";
        else
            result += "трехзначное число";

        System.out.println(result);
    }
}
