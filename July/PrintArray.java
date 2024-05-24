import java.util.Scanner;
public class PrintArray {

    public static void printArrayForLoop(int[] arr){
        System.out.println("Print Array using For Loop:- ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printArrayEachLoop(int[] arr){
        System.out.println("Print Array using For Each Loop:- ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        printArrayForLoop(arr);
        printArrayEachLoop(arr);
    }
}
