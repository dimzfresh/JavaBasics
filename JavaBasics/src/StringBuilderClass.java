public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hi");
        builder.append(" my").append(" age is ").append(30);
        System.out.println(builder.toString());
    }
}
