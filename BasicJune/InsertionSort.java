import java.util.Scanner;
public class InsertionSort {

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

    public static void insertionSort(int[] arr){
        int n=arr.length;

        for(int i=1; i<n; i++){
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                swapArray(arr, j, j-1);
                j--;
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

        insertionSort(arr);

    }
}
