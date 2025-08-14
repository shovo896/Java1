// Abstract Class
abstract class vehicle {
    private String brand;
    private String model;
    private double rentalPricePerDay;

    public vehicle(String brand, String model, double rentalPricePerDay) {
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Getters and Setters (Encapsulation)
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getRentalPricePerDay() { return rentalPricePerDay; }
    public void setRentalPricePerDay(double rentalPricePerDay) { this.rentalPricePerDay = rentalPricePerDay; }

    // Abstract method for rental cost calculation
    public abstract double calculateRentalCost(int days);
}

// Car Class - Inheritance & Polymorphism
class Car extends vehicle {
    public Car(String brand, String model, double rentalPricePerDay) {
        super(brand, model, rentalPricePerDay);
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getRentalPricePerDay() * days;
        double maintenanceFee = 500; // fixed fee
        return baseCost + maintenanceFee;
    }
}

// Bike Class - Inheritance & Polymorphism
class Bike extends vehicle {
    public Bike(String brand, String model, double rentalPricePerDay) {
        super(brand, model, rentalPricePerDay);
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getRentalPricePerDay() * days;
        if (days > 7) {
            return baseCost * 0.95; // 5% discount
        }
        return baseCost;
    }
}

// Customer Class - Composition
class Customer {
    private String name;
    private vehicle rentedVehicle;
    private int rentalDays;

    public Customer(String name, vehicle rentedVehicle, int rentalDays) {
        this.name = name;
        this.rentedVehicle = rentedVehicle;
        this.rentalDays = rentalDays;
    }

    public void displayRentalDetails() {
        double totalCost = rentedVehicle.calculateRentalCost(rentalDays);
        System.out.println("Customer: " + name +
                ", Vehicle: " + rentedVehicle.getBrand() + " " + rentedVehicle.getModel() +
                ", Days: " + rentalDays +
                ", Total Cost: " + totalCost);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        vehicle car = new Car("Toyota", "Corolla", 2000);
        vehicle bike = new Bike("Yamaha", "R15", 1000);

        Customer customer1 = new Customer("Alice", car, 5);
        Customer customer2 = new Customer("Bob", bike, 10);

        customer1.displayRentalDetails();
        customer2.displayRentalDetails();
    }
}

