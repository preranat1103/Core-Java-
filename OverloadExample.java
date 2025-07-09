public class OverloadExample {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        System.out.println("Addition of 2 integers: " + obj.add(5, 10));
        System.out.println("Addition of 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Addition of 2 doubles: " + obj.add(5.5, 10.5));
    }
}
