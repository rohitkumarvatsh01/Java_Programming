import java.util.Scanner;
import java.util.Arrays;
public class SmallestLargestElementArray {

    public static int[] smallestGreatest(int[] arr){
        Arrays.sort(arr);

        int[] ans={arr[0], arr[arr.length-1]};

        return ans;
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
    }

    System.out.println("Smallest and Greatest:- " + smallestGreatest(arr));
}
