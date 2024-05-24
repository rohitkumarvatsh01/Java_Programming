import java.util.Scanner;
public class RangePrifixSum {

    static int[] prefixSum(int[] arr){
        int n=arr.length;

        for(int i=1; i<n; i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int[] prefSum=prefixSum(arr);

        System.out.println("Enter number of Queries:- ");
        int q=sc.nextInt();

        while(q-->0){
            System.out.println("Enter the range:- ");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans=prefSum[r]-prefSum[l-1];
            System.out.println("Sum:- "+ans);
        }
    }
}
}
