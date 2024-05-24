import java.util.Scanner;

public class AverageOfArray{

    public static int averageOfArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }

        int avg=sum/arr.length;

        return avg;
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

        int ans=averageOfArray(arr);
        System.out.println("The Average of Array Element:- "+ans);
    }
}