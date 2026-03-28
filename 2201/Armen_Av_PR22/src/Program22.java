public class Program22 {
    public static void main(String[] args) {

        int n = -12;

        if (n > 0)
            n -= 8;
        else if (n < 0)
            n += 6;
        else
            n = 10;

        System.out.println(n);
    }
}
