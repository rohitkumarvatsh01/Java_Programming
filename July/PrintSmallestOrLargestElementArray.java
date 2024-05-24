import java.util.Scanner;
import java.util.Arrays;
public class PrintSmallestOrLargestElementArray {

    public static int[] smallestLargestElement(int[] arr){
        Arrays.sort(arr);

        int[] ans=new int[2];
        ans[0]=arr[0];
        ans[1]=arr[arr.length-1];
        return ans;
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

        int[] ans=smallestLargestElement(arr);
        System.out.println(ans);
    }
}
