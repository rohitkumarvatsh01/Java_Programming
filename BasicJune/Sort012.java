import java.util.Scanner;
public class Sort012{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=left;
        left=right;
        right=temp;
    }

    public static void sort012(int[] arr){
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;

        while(left<=right){
            if(arr[mid]==0){
                swapArray(arr, left, right);
                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swapArray(arr, mid, right);
                right--;
            }
        }
        printArray(arr);
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

        sort012(arr);
    }
}