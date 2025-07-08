import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Collection {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<>();

        System.out.println("Enter integer inputs one by one");

        while(true){
            try {
                int n=sc.nextInt();
                num.add(n);
            } catch (InputMismatchException e) {
                break;
            }
        }

        int arr[]=new int[num.size()];
        for (int i=0;i<num.size();i++){
            arr[i]=num.get(i);
        }

        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j] > key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Sorted array :");
        for (int n : arr){
            System.out.println(n + "");
        }
    }
    }
