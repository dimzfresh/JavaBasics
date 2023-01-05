import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type something...");

        String inputString = scanner.nextLine();

        System.out.println("Input text: " + inputString);
    }
}
