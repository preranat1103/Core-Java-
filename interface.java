interface herbivor{
    void meat();
}
interface carbivor{
    void grass();
}

class Bear implements herbivor,carbivor{
     public void meat(){
        System.out.println("They eat meat");
    }
    public void grass(){
        System.out.println("they eat grass");
    }
    }
public class MainInt{
    public static void main(String arg[]){

    Bear b1=new Bear();
    b1.meat();
    b1.grass();
    }
}

