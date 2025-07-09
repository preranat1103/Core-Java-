public class OverrideExample {
    public static void main(String[] args) {
        Vehical v=new Vehical();
        v.move();

        Splender s=new Splender();
        s.move();

        Vehical v1=new Splender();
        v1.move();
        
    }
}

class Vehical{
    void move(){
        System.out.println("Vehicals can move according to there company millage");
    }
}

class Splender extends Vehical{
    @Override
    void move(){
        System.out.println("Splender is much better than other");
    }

}
