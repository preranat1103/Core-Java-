public class largest {
    public static void main(String arg[]){
        int num[]={10,20,30,40,50};

        int largest=num[0];

        for(int i=0;i<num.length;i++){
            if(num[i] > largest){
                largest=num[i];
            }
        }
        System.out.println("Largest number is : " +largest);
    }
}
