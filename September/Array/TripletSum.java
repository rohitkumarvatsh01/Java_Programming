import java.util.Scanner;
public class TripletSum {

    public static int targetSum(int[] arr, int target){
        int count=0;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]==target){
                        count++;
                    }
                }
            }
        }
        return count;
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

        System.out.println("Enter the target Sum:- ");
        int target=sc.nextInt();

        System.out.println("Target Sum:- "+targetSum(arr, target));
    }
}
