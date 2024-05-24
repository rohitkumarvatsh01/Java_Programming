import java.util.Scanner;

public class ArrayPrintWithForEachLoop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array element output:- ");
        for(int b:arr){
            System.out.print(b+" ");
        }
    }
}