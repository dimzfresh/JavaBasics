public class Loops {
    public static void main(String[] args) {
        // 1. while
        int myNumber = 7;
        while (myNumber > 0) {
            System.out.println(myNumber);
            myNumber -= 1;
        }

        // 2. for
        for (int index = 1; index <= 10; index += 1) {
            System.out.println("Index: " + index);
        }

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        for (int number: numbers) {
            System.out.println("Number: " + number);
        }
    }
}
