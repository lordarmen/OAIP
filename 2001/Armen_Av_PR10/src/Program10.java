public class Program10 {
    public static void main(String[] args) {

        int A = 23;
        int B = 17;
        int C = 5;

        int countX = A / C;
        int countY = B / C;

        int totalSquares = countX * countY;

        int rectangleArea = A * B;
        int squaresArea = totalSquares * C * C;

        int freeArea = rectangleArea - squaresArea;

        System.out.println("Количество квадратов = " + totalSquares);
        System.out.println("Незанятая площадь = " + freeArea);
    }
}
