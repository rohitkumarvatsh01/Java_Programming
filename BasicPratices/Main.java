import java.util.Scanner;
public class Main{

    //Print Array
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Swap the Array
    public static void swapArray(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    //Bubble Sort
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    swapArray(arr, i, j);
                }
            }
        }
    }

    //Selection Sort
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swapArray(arr, minIndex, i);
        }
    }

    //Insertion Sort
    public static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int j=i;
            while(j>0 && arr[j]>arr[j+1]){
                swapArray(arr, j, i);
                i++;
                j--;
            }
        }
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

        //Bubble sort Calling
        bubbleSort(arr);
        printArray(arr);

        //Selection sort Calling
        selectionSort(arr);
        printArray(arr);

        //Insertion sort Calling
        insertionSort(arr);
        printArray(arr);
    }
}