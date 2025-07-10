// Parent class
class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("I am an animal");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    Dog() {
        // Calling parent class constructor
        super();
        System.out.println("Dog constructor called");
    }

    void printName() {
        // Accessing parent class variable
        System.out.println("Animal name: " + super.name);
        System.out.println("Dog name: " + this.name);
    }

    void show() {
        // Calling parent class method
        super.display();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printName();
        d.show();
    }
}
