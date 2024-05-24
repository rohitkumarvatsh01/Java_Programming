import java.util.Scanner;
public class SmallestOrLargestElement {

    public static int[] smallestLargestElement(int[] arr){
        int small=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }

        int large=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }

        int[] ans=new int[2];
        ans[0]=small;
        ans[1]=large;
        return ans;
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

        int[] ans=smallestLargestElement(arr);
        System.out.println(ans);
    }
}
