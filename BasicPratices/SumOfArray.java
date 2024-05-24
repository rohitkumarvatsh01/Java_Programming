import java.util.Scanner;
public class SumOfArray{

    public static int sumOfArray(int[] arr){
        int n=arr.length;
        int sum=0;

        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int ans=sumOfArray(arr);
        System.out.println("Sum of Array:- "+ans);
    }
}