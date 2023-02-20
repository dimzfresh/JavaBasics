public class ClassesAndObjects {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Cat";
        cat.age = 3;
        cat.sayHello();

        Animal dog = new Animal();
        dog.name = "Dog";
        dog.age = 5;
        dog.sayHello();

        cat = dog;

        cat.sayHello();
        String info = cat.getInfo();
        System.out.println(info);
    }
}

final class Animal {
    String name;
    int age;

    String getInfo() {
        return "Name: " + name + " " + "\nAge: " + age;
    }

    void sayHello() {
        System.out.println("Name: " + name + " says hello");
    }
}