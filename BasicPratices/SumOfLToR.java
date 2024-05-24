import java.util.Scanner;
public class SumOfLToR{

    public static int sumArray(int[] arr, int l, int r){
        int sum=0;
        for(int i=l; i<=r; i++){
            sum+=arr[i];
        }
        return sum;
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

        System.out.println("Enter the Value of L:- ");
        int l=sc.nextInt();

        System.out.println("Enter the Value of R:- ");
        int r=sc.nextInt();

        int ans=sumArray(arr, l, r);
        System.out.println("Sum of the Array Between in Range of L and R:- "+ans);
    } 
}
