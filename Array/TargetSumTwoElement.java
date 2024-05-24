import java.util.Scanner;
public class TargetSumTwoElement{

    public static int targetSum(int[] arr, int target){
        int count=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Target Sum:- ");
        int target=sc.nextInt();

        int ans=targetSum(arr, target);
        System.out.println("The Count of Target Sum in Array:- "+ans);
    }
}