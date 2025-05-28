import java.util.Scanner;

public class Number {
    private static int[] numbers = new int[10];
    public int readNumber() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = sc.nextInt();
        if (number < 0 ) {
            throw new NumberFormatException("Liczba nie może być mniejsza od zera");
        }
        return number;
    }
    public void fillArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = readNumber();
        }
    }
    public void printArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
