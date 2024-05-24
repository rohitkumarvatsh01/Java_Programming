import java.util.Scanner;
public class PairSum {

    public static int pairSum(int[] arr, int target){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
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

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Target:- ");
        int target=sc.nextInt();
        
        System.out.println("Count Pair Sum:- "+pairSum(arr, target));
    }
}
