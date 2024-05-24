import java.util.Scanner;
public class SelectionSort {

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void insertionSort(int[] arr){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex=i;
            for(int j=i+1; j<n; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            swapArray(arr, minIndex, i);
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

        insertionSort(arr);
        printArray(arr);
    }
}
