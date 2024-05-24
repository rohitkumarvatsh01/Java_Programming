import java.util.Scanner;
public class ReverseArrayUsingExtraSpace {

    public static int[] reverseArray(int[] arr){
        int[] ans=new int[arr.length];
        int j=0;

        for(int i=arr.length-1; i>=0; i--){
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

        int[] ans=reverseArray(arr);
        System.out.println(ans);
    }
}
