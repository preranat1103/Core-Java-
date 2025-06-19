import java.util.Scanner;

class Dmart{
    String itemName;
    double price;

    void getDetails(String item,double cost){
        itemName=item;
        price=cost;
    }
    void showDetails(){
        System.out.println("Item: " +itemName);
        System.out.println("Price: "+price);
    }
}
class Grocery extends Dmart{
    void calcDiscount(){
        if (price>1000){
            System.out.println("Discount: " +(price*0.10));
        }
        else{
            System.out.println("No discount for grocery below 1000");
        }
    }
}

class Electronics extends Dmart{
    void calcDiscount(){
        if(price>5000){
            System.out.println("Discount mrp is: " +(price*0.15));
        }
        else{
            System.out.println("No discount allowed below 5000 on electronics");
        }
    }
}

public class Inherit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the type of item: ");
        String type=sc.nextLine().toLowerCase();

        System.out.println("Enter the name: " );
        String name=sc.nextLine();

        System.out.println("Enter the price: ");
        double price=sc.nextDouble();

        if(type.equals("grocery")){
            Grocery g=new Grocery();
            g.getDetails(name, price);
            g.showDetails();
            g.calcDiscount();
        }
        else if(type.equals("electronics")){
            Electronics e=new Electronics();
            e.getDetails(name, price);
            e.showDetails();
            e.calcDiscount();
        }
        else{
            System.out.println("invalid item type  entered");
        }
        sc.close();
    }
}
