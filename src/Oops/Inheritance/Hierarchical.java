package Oops.Inheritance;

class Vehicle {
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle{
    void wheel(){
        System.out.println("It is two wheeler");
    }
}
class Car extends Vehicle{
    void doors(){
        System.out.println("It has four doors");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Car c = new Car();
        c.doors();
        c.run();

        Bike b = new Bike();
        b.wheel();
        b.run();
    }
}
