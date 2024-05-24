import java.util.Scanner;
import java.util.Arrays;

public class ArrayMethod{

    //Print Array
    public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Sort method
    public static void sortMethod(int arr, int n){
        System.out.println("The Array element sort:- ");
        Arrays.sort(arr);
        printArray(arr, n);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        sortMethod(arr, n);
    }
}