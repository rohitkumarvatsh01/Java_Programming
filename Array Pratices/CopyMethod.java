import java.util.Scanner;
import java.util.Arrays;

public class CopyMethod {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] copyMethod(int[] arr){
        int[] brr=new int[arr.length];

        System.out.println("New Copy Array:- ");
        brr=Arrays.copyOf(arr, arr.length);

        return brr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        copyMethod(arr);
        printArray(arr);
    }
}
