import java.util.Scanner;
public class ReverseArray{

    public static void reverseArray(int[] arr){
        int n=arr.length;
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
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

        reverseArray(arr);
    }
}