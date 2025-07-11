class Animal{
    Animal(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    Dog(){
        super();
        System.out.println("Dog can Bark");
    }
}

public class Super1 {
    public static void main(String[] args) {
        Dog d=new Dog();
    }
}
