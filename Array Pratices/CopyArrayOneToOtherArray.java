import java.util.Scanner;

public class CopyArrayOneToOtherArray{

    public static void printArray(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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

        //New Array Create
        System.out.println("Copy Array:- ");
        int[] brr=new int[arr.length];

        for(int i=0; i<n; i++){
            brr[i]=arr[i];
            printArray(brr);
        }
    }
}