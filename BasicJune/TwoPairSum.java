import java.util.Scanner;
public class TwoPairSum {

    public static int countPair(int[] arr, int target){
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

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Target sum:- ");
        int target=sc.nextInt();

        int ans=countPair(arr, target);
        System.out.println("Count of pair sum:- "+ans);
    }
}
