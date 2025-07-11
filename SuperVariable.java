class Bank {
    void Money(){
        System.out.println("Money is debited");
    }
}

class BOM extends Bank {
    void Money () {
        super.Money();
        System.out.println("Money is Credited");
    }
}


public class Super3 {
    public static void main(String[] args) {
        BOM b=new BOM();
        b.Money();
    }
}
