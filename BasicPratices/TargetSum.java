import java.util.Scanner;
public class TargetSum{

    public static int targetSum(int[] arr, int sum){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
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

        System.out.println("Enter the Target Sum:- ");
        int sum=sc.nextInt();

        System.out.println("Count of Target Sum:- "+targetSum(arr, sum));
    }
}