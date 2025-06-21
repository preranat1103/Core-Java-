import java.util.Scanner;
abstract class Vehicle{
    abstract void startEngine();
    void fuelType(String fuel){
        if (fuel.equalsIgnoreCase("petrol")){
            System.out.println("We have petrol");
        }
        else{
            System.err.println("Sorry !! We only have have petrol");
        }
    }
}
class Car extends Vehicle{
    void startEngine(){
        System.out.println("Start the engine with Petrol");
    }
}

public class Abs1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Car c=new Car();
        c.startEngine();

        System.out.println("Enter Fuel type: ");
        String a=sc.nextLine();

        c.fuelType(a);
        
    }
    
}
