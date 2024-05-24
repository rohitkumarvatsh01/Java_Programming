import java.util.Scanner;
public class LargestElement {

    public static int largestElement(int[] arr){
        int large=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }

        return large;
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

        int ans=largestElement(arr);
        System.out.println("The Largest Element in Array:- "+ans);
    }
}
