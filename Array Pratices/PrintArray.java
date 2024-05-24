import java.util.Scanner;

public class PrintArray {

    //Foor Loop
    public static void printArryForLoop(int[] arr){
        System.out.println("Array Print by For Loop:- ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //For Each Loop
    public static void printArryForEachLoop(int[] arr){
        System.out.println("Array Print by For Each Loop:- ");

        for(int brr:arr){
            System.out.print(brr+" ");
        }
        System.out.println();
    }

    //Main Fuction
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //Fuction calling
        printArryForLoop(arr);
        printArryForEachLoop(arr);
    }
}
