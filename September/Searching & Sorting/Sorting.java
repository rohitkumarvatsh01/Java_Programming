import java.util.Scanner;
public class Sorting{

    //Print the Array
    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Swap the Array
    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    //Bubble Sort
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    swapArray(arr, i, j);
                }
            }
        }
        printArray(arr);
    }

    //Selection Sort
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swapArray(arr, i, minIndex);
        }
        printArray(arr);
    }

    //Insertion Sort
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swapArray(arr, j, j-1);
                j--;
            }
        }
        printArray(arr);
    }

    //Main Function
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
        selectionSort(arr);
        insertionSort(arr);
    }
}