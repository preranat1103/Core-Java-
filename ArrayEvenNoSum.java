import java.util.Scanner;

class Array{
    public static void main(String arg[]){
        int a[][]=new int[3][3];

        int i,j;
        Scanner sc=new Scanner(System.in);

        System.out.println("Display A array");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        int num=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(a[i][j]%2==0){
                    num += a[i][j];
                }
            }
        }
        System.out.println("Addition is : " +num);
    }
}
