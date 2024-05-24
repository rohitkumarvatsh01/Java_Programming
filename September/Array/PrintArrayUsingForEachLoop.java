import java.util.Scanner;
public class PrintArrayUsingForEachLoop {

    public static void printArray(int[] arr){
        for(int brr:arr){
            System.out.print(brr+" ");
        }
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

        printArray(arr);
        
    }
}
