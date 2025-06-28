// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another Child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a; // reference of parent class

        a = new Dog(); // object of Dog
        a.sound();     // calls Dog's sound()

        a = new Cat(); // object of Cat
        a.sound();     // calls Cat's sound()
    }
}
