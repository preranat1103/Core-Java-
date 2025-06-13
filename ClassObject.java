class Dream{                //Create class
        void loan(){
            System.out.println("Loan is nill");     //Object behaviour
        }
        void gold(){
            System.out.println("Mumma's Mangalsutra and Pappa's chain is finally taken");
        }
        void airoplane(){
            System.out.println("Aajji and Aajoba airoplane trip is done");
        }
        void MT15(){
            System.out.println("Shivraj MT15,i buy finally");
        }
}

public class classObject{
    public static void main(String arg[]){
        Dream d=new Dream();        //object implementation with using referances
        d.loan();
        d.MT15();
        d.gold();
        d.airoplane(); 
    }
}
