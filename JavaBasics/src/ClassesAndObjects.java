public class ClassesAndObjects {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setNameAndAge("Cat", 3);
        cat.sayHello();

        Animal dog = new Animal();
        dog.setNameAndAge("Dog", 5);
        dog.sayHello();

        cat = dog;

        cat.sayHello();
        String info = cat.getInfo();
        System.out.println(info);

        cat.setNameAndAge("Fluffy", 7);
        String info1 = cat.getInfo();
        System.out.println(info1);
    }
}

final class Animal {
    private String name;
    private int age;

    String getInfo() {
        return "Name: " + name + " " + "\nAge: " + age;
    }

    public void setNameAndAge(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
    public void sayHello() {
        System.out.println("Name: " + name + " says hello");
    }
}