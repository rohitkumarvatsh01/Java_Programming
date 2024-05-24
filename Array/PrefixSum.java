import java.util.Scanner;
public class PrefixSum {

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] prefixSum(int[] arr){
        int n=arr.length;

        for(int i=1; i<n; i++){
            arr[i]=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:-");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:-");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] ans=prefixSum(arr);
        printArray(ans);
    }
}
