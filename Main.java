abstract class Vehicle {
    // abstract methods (what it can do) 
    abstract void accelerate();
    abstract void brake();
    // concerete method (what it is)
    void startEngine(){
        System.out.println("Engine started");
    }
}
// concrete implementation 
class Car extends Vehicle{
    
    void accelerate() {
        System.out.println("Car is accelerating");
    }
    
    void brake() {
        System.out.println("Car is braking");
        // Hidden logic : hydraulic presuure ,brake pads ,etc.
    }
}
public class Main{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}
