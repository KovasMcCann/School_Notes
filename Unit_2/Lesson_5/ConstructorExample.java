class Car {
    String model;
    int year;

    // Default constructor
    Car() {
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        System.out.println(car1.model + " " + car1.year); // Output: Unknown 0

        // Using parameterized constructor
        Car car2 = new Car("Tesla", 2024);
        System.out.println(car2.model + " " + car2.year); // Output: Tesla 2024
    }
}
