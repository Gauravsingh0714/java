import java.util.Scanner;

class Vehicle {
    String brand;
    int maxSpeed;

    Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    void startEngine() {
        System.out.println("Starting vehicle engine...");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int maxSpeed, int numberOfDoors) {
        super(brand, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void startEngine() {
        System.out.println(brand + " car engine started with push-button start: Vroom Vroom!");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String brand, int maxSpeed, boolean hasGear) {
        super(brand, maxSpeed);
        this.hasGear = hasGear;
    }

    @Override
    void startEngine() {
        System.out.println(brand + " bike engine started with self-kick start: Roar!");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

public class vehicleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Car Details ---");
        System.out.print("Enter car brand: ");
        String carBrand = sc.nextLine();
        System.out.print("Enter car max speed: ");
        int carSpeed = sc.nextInt();
        System.out.print("Enter number of doors: ");
        int carDoors = sc.nextInt();
        sc.nextLine();

        Car myCar = new Car(carBrand, carSpeed, carDoors);

        System.out.println("\n--- Enter Bike Details ---");
        System.out.print("Enter bike brand: ");
        String bikeBrand = sc.nextLine();
        System.out.print("Enter bike max speed: ");
        int bikeSpeed = sc.nextInt();
        System.out.print("Does the bike have gears? (true/false): ");
        boolean hasGear = sc.nextBoolean();

        Bike myBike = new Bike(bikeBrand, bikeSpeed, hasGear);

        System.out.println("\n--- Car ---");
        myCar.displayInfo();
        myCar.startEngine();

        System.out.println("\n--- Bike ---");
        myBike.displayInfo();
        myBike.startEngine();

        sc.close();
    }
}
