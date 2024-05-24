import java.util.Scanner;
public class PrefixSumArray{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void prefixSumArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            arr[i]=sum;
        }
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
        
        prefixSumArray(arr);
        printArray(arr);
    }
}
