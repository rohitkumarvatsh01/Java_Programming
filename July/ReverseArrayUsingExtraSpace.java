import java.util.Scanner;
public class ReverseArrayUsingExtraSpace{

    public static int[] reverse(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];

        int j=0;
        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        return ans;
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

        System.out.println(reverse(arr));
    }
}
