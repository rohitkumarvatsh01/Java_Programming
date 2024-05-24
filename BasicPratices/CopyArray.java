import java.util.Scanner;
public class CopyArray{

    public static void copyArray(int[] arr){
        int[] brr=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            brr[i]=arr[i];
            System.out.print(brr[i]+" ");
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

        copyArray(arr);
    }
}