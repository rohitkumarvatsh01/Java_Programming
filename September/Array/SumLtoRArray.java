import java.util.Scanner;
public class SumLtoRArray {

    public static int rangeSum(int[] arr, int l, int r){
        int sum=0;
        for(int i=l; i<=r; i++){
            sum+=arr[i];
        }
        return sum;
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

        System.out.println("Enter the Range L:- ");
        int l=sc.nextInt();

        System.out.println("Enter the Range R:- ");
        int r=sc.nextInt();

        int ans=rangeSum(arr, l, r);
        System.out.println("Sum of Range:- "+ans);
    }
}
