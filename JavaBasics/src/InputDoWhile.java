import java.util.Scanner;
public class InputDoWhile {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Type number 5");
            number = scanner.nextInt();
        } while (number != 5);

        System.out.println("Correct number 5!");
    }
}
