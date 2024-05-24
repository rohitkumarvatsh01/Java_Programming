import java.util.Scanner;
public class BubbleSelectionInsertionSort{

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
        
        System.out.println("Bubble Sort Algoritham:- ");
        
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
        
        System.out.println("Selection Sort Algoritham:- ");

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

    //Insertion Sort
    public static void insertionSort(int[] arr){
        
        System.out.println("Insertion Sort Algoritham:- ");

        for(int i=1; i<arr.length; i++){
            int j=i;
            
            while(j>0 && arr[j]<arr[j-1]){
                swapArray(arr, j, j-1);
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

        bubbleSort(arr);
        printArray(arr);
        
        insertionSort(arr);
        printArray(arr);
        
        selectionSort(arr);
        printArray(arr);
    }
}