class Vehicle {
    void start(){
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle {
    void driving(){
        System.out.println("Car driving");
    }
}



public class VehicleCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.driving();
    }
}