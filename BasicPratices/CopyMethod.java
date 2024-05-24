import java.util.Scanner;
import java.util.Arrays;

public class CopyMethod{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] brr=Arrays.copyOf(arr, arr.length);

        for(int i=0; i<n; i++){
            System.out.print(brr[i]+" ");
        }

    }
}