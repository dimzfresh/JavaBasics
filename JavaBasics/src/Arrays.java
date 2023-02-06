public class Arrays {
    public static void main(String[] args) {
        char[] nameArray = new char[4];
        for (int index = 0; index < nameArray.length; index++) {
            switch (index) {
                case 0:
                    nameArray[index] = 'J';
                    break;
                case 1:
                    nameArray[index] = 'a';
                    break;
                case 2:
                    nameArray[index] = 'v';
                    break;
                case 3:
                    nameArray[index] = 'a';
                    break;
            }
        }

        String result = String.valueOf(nameArray);
        System.out.println("The best programming language ever: " + result);

        int[] numbers = {1, 2, 3, 4, 5};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Current number: " + numbers[index]);
        }
        
        String[] random = new String[3];
        random[0] = "I";
        random[1] = "like";
        random[2] = "Java";

        for (String str: random) {
            System.out.println(str);
        }
    }
}
