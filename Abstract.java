abstract class Vehicle{
    abstract void startEngine();
    void fuelType(){
        System.out.println("Petrol");
    }
}

class Car extends Vehicle{
    void startEngine(){
        System.out.println("Engine starts when petrol inserted");
    }
}

public class abs{
    public static void main(String arg[]){
        Car c=new Car();
        c.startEngine();
        c.fuelType();
    }
}
