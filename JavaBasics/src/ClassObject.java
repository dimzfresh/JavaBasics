public class ClassObject {
    public static void main(String[] args) {
        System.out.printf("This is new lesson '%s'\n", "Class Object");

        Car car = new Car("BMW");

        System.out.println(car.toString());
    }
}

final class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Car brand: " + this.brand;
    }
}