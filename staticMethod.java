import java.util.Scanner;

public class Stat1 {
    //static method

    static void greet(String name){
        System.out.println("Hello " +name+ " !! This is Static method in Java");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.nextLine();

        greet(name);
        sc.close();
    }
}
