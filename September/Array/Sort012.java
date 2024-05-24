import java.util.Scanner;
public class Sort012{

    //Print the Array
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Swap the Array using temp variable
    public static void swapArray(int[] arr, int start, int end){
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    //Sort the Array in 0 1 2
    public static void sort012(int[] arr){
        int n=arr.length;
        int start=0;
        int mid=0;
        int end=n-1;

        while(mid<=end){
            if(arr[mid]==0){
                swapArray(arr, start, mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swapArray(arr, mid, end);
                end--;
            }
        }
    }

    //Main Function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        sort012(arr);
        printArray(arr);
    }
}