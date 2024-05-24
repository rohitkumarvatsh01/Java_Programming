import java.util.Scanner;

public class PrefixSemSufixSumEqual {
    
    static int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    static boolean prefixSumSufixSumEqual(int[] arr){
        int totalSum=sumOfArray(arr);
        int prefixSum=0;
        int n=arr.length;

        for(int i=0; i<n; i++){
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            if(prefixSum==suffixSum){
                return true;
            }
        }
        return false;
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

        System.out.println("Prefix Sum and Suffix sum Equal or not:- "+prefixSumSufixSumEqual(arr));

    }
}
