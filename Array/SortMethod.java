import java.util.Scanner;
import java.util.Arrays;

public class SortMethod{

    //Print the Array
    public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Sort Method
    public static void sortMethod(int[] arr, int n){
        System.out.println("The Sort Array element is:- ");
        Arrays.sort(arr);
        printArray(arr, n);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter element of Array1:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] brr=new int[n];
        System.out.println("\nEnter element of Array2:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        sortMethod(arr, n);
        
        if(Arrays.equals(arr, brr)){
            System.out.println("/nThe Array1 is equal to Array2");
        }
        else{
            System.out.println("/nThe Arrays1 is not equal to Array2");
        }

        int crr[]=new int[n];
        Arrays.copyOf(arr, n);
        
    }
}