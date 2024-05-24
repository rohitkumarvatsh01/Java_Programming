import java.util.Scanner;

public class PairSum{

    static int pairSum(int[] arr, int target){
        int n=arr.length;
        int count=0;
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

        System.out.println("Enter the element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target value:- ");
        int target=sc.nextInt();

        System.out.println("The count of Pair Sum:- "+pairSum(arr, target));

    }
}