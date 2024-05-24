import java.util.Scanner;
public class PerfixSum {

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void prefixSum(int[] arr){
        int n=arr.length;

        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            arr[i]=sum;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element in Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        prefixSum(arr);
        printArray(arr);
    }
}
