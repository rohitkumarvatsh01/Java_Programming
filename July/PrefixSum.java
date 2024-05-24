import java.util.Scanner;
public class PrefixSum{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void prefixSum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            arr[i]=sum;
        }
    }

    public static int[] prefixSums(int[] arr){
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];

        for(int i=1; i<n; i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
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

        prefixSum(arr);
        printArray(arr);

        System.out.println();

        int[] ans=prefixSums(arr);
        System.out.println(ans);
    }
}