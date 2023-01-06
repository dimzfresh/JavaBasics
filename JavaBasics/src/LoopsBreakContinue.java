public class LoopsBreakContinue {
    public static void main(String[] args) {
        //1. break
        int number = 0;
        while (true) {
            if (number >= 15) {
                System.out.println("Loop break on 15!");
                break;
            }

            number += 1;
        }


        //2.continue
        for (int index = 0; index <= 21; index += 1) {
            if (index % 2 != 0) {
                continue;
            }
            System.out.println("Loop current index " + index);
        }
    }
}
