import java.util.Arrays;
import java.util.Scanner;
public class SmallestAndLargest{
    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0], arr[arr.length-1]};
        return ans;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element in Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=smallestAndLargestElement(arr);
        System.out.println("Smallest:- "+ ans[0]);
        System.out.println("Greatest:- "+ ans[1]);
    }
}