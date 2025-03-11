abstract class Vehicle {
    private final String model;

    public Vehicle(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.model = model;
    }

    abstract void startEngine();

    public void displayInfo() {
        System.out.printf("This is a vehicle: %s\n", model);
    }
}
class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    void startEngine() {
        System.out.println("Starting engine for car");
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String model) {
        super(model);
    }

    @Override
    void startEngine() {
        System.out.println("Starting engine for motocycle");
    }
}

interface Swimmable {
    void swim();
}
class Dolphin implements Swimmable {
    private final String name;

    public Dolphin(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming gracefully");
    }
}
class Submarine implements Swimmable {
    private final String name;

    public Submarine(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }


    @Override
    public void swim() {
        System.out.println(name + " is driving underwater");
    }
}

public class InterfaceAndAbstractHomework {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Car"),
                new Motorcycle("Motorcycle"),
        };

        Swimmable[] swimmables = {
                new Dolphin("Dolphin"),
                new Submarine("Submarine"),
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.displayInfo();
            System.out.println();
        }

        for (Swimmable swimmable : swimmables) {
            swimmable.swim();
            System.out.println();
        }
    }
}
