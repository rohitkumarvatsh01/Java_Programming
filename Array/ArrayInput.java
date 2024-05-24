import java.util.Scanner;

public class ArrayInput{
    static void ArrayPrint(int []arr){
        System.out.println("The Array Printing:- ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter the element of Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        ArrayPrint(arr);
    }
}