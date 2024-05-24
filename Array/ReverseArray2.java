import java.util.Scanner;

public class ReverseArray2 {
    
    static void reverseArray(int[] arr){
        int n=arr.length;

        System.out.println("The Reverse Array:- ");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
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

        reverseArray(arr);
    }
}
