import java.util.Scanner;
public class SortArray {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void descendingOrder(int[] arr){
        System.out.println("Descending Order:- ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    swapArray(arr, i, j);
                }
            }
        }
        printArray(arr);
    }

    public static void ascendingOrder(int[] arr){
        System.out.println("Ascending Order:- ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    swapArray(arr, i, j);
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

        ascendingOrder(arr);
        descendingOrder(arr);
    }
}
