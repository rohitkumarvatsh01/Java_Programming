import java.util.Scanner;
import java.util.Arrays;

public class EqualMethod {

    public static void equalMethod(int[] arr, int[] brr){
        boolean ans=Arrays.equals(arr, brr);
        if(ans==true){
            System.out.println("Equal Arrays");
        }else{
            System.out.println("Not Equal Arrays");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array1:- ");
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        for(int i=0; i<n1; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Array2:- ");
        int n2=sc.nextInt();
        int[] brr=new int[n2];
        for(int i=0; i<n2; i++){
            brr[i]=sc.nextInt();
        }

        equalMethod(arr, brr);
    }
}
