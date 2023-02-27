public class ThisKeyWord {
    public static void main(String[] args) {
        Human human = new Human();
        human.setNameAndAge("Dima", 30+);
        String info = human.getInfo();
        System.out.println(info);
    }
}

class Human {
    private String name;
    private int age;

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getInfo() {
        return "Hi! My name is " + name + " and I'm " + age + " years old:)";
    }
}
