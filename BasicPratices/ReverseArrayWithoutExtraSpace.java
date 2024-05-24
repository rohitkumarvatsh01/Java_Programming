import java.util.Scanner;
public class ReverseArrayWithoutExtraSpace {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void reverseArray(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            swapArray(arr, left, right);
            left++;
            right--;
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
        
        reverseArray(arr);
        printArray(arr);
    }
}
