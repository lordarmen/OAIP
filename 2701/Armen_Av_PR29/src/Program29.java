public class Program29 {
    public static void main(String[] args) {

        int N = 12; // достоинство
        int M = 4;  // масть

        String value = "";
        String suit = "";

        switch (N) {
            case 6: value = "шестерка"; break;
            case 7: value = "семерка"; break;
            case 8: value = "восьмерка"; break;
            case 9: value = "девятка"; break;
            case 10: value = "десятка"; break;
            case 11: value = "валет"; break;
            case 12: value = "дама"; break;
            case 13: value = "король"; break;
            case 14: value = "туз"; break;
        }

        switch (M) {
            case 1: suit = "пик"; break;
            case 2: suit = "треф"; break;
            case 3: suit = "бубен"; break;
            case 4: suit = "червей"; break;
        }

        System.out.println(value + " " + suit);
    }
}
