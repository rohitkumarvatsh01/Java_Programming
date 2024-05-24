import java.util.Scanner;

public class ReverseArrayWithoutSwap{

    static void printArray(int[] arr){
       
        System.out.println("The Reverse Array:- ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] reverseArrayWithoutSwap(int[] arr){
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

        int[] arr=new int[n];
        System.out.println("Enter the element of Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] ans=reverseArrayWithoutSwap(arr);
        printArray(ans);
    }
}