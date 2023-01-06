import java.util.Scanner;
public class OperatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type something...");

        String inputString = scanner.nextLine();

        switch (inputString.toLowerCase()) {
            case "hello":
                System.out.println("Typed hello");
            case "bye":
                System.out.println("Typed bye");
            default:
                System.out.println("Typed unknown words");
        }
    }
}
