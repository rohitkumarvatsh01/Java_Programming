import java.util.Scanner;
public class CopyArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("First Array:- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        int[] brr=new int[n];
        for(int i=0; i<n; i++){
            brr[i]=arr[i];
        }

        System.out.println("\nSecond Array:- ");
        for(int i=0; i<n; i++){
            System.out.print(brr[i]+" ");
        }
        
    }
}