import java.util.Arrays;
import java.util.Scanner;
public class PrintArray{

    public static void forLoop(int[] arr){
        System.out.println("Array Print Using For loop:- ");
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    public static void forEachLoop(int[] arr){
        System.out.println("Array Print Using For Each loop:- ");
        for(int i:arr){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    public static void withoutLopp(int[] arr){
        System.out.print(Arrays.toString(arr));

        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        forLoop(arr);
        forEachLoop(arr);
        withoutLopp(arr);
    }
}