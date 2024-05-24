import java.util.Scanner;
public class SelectionSort{

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

    public static void selectionSort(int[] arr){
        
        for(int i=0; i<arr.length-1; i++){
            int minIndex=i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swapArray(arr, i, minIndex);
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

        selectionSort(arr);
        printArray(arr);
    }
}