import java.util.Scanner;
public class ReverseArrayInGroup{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void reverseArray(int[] arr, int k){
        int n=arr.length;

        for(int i=0; i<n; i+=k){
            int start=i;
            int end=Math.min(i+k-1, n-1);

            while(start<end){
                swapArray(arr, start, end);
                start++;
                end--;
            }
        }
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

        System.out.println("Enter the Value of K:- ");
        int k=sc.nextInt();

        reverseArray(arr, k);
        printArray(arr);
    }
}