import java.util.Scanner;
public class CopyOneArraytToAnotherArray {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array:- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        int[] brr=new int[n];
        System.out.println("\nCopy Array:- ");
        
        for(int i=0; i<n; i++){
            brr[i]=arr[i];
            System.out.print(brr[i]+" ");
        }
    }
}
