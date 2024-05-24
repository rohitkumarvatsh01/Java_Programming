import java.util.Scanner;
public class BubbleSort {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void bubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    swapArray(arr, j, j+1);
                }
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

        bubbleSort(arr);

    }
}
