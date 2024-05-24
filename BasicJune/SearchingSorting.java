import java.util.Scanner;
public class SearchingSorting{

    //Print Array
    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Swap the Two Number
    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    //Linear Search
    public static int linearSearch(int[] arr, int key){
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return  0;
    }

    //Binary Search
    public static int binarySearch(int[] arr, int key){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;

        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end--;
            }
            mid=(start+end)/2;
        }
        return 0;
    }

    //Bubble sort
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
            int min_index=i;
            for(int j=1+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
                swapArray(arr, i, min_index);
            }
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

        System.out.println("Enter the Search Element:- ");
        int x=sc.nextInt();

        System.out.println("Linear Search:- "+linearSearch(arr, x));
        System.out.println("Binary Search:- "+binarySearch(arr, x));

        System.out.println("Bubble sort:- ");
        bubbleSort(arr);

        System.out.println("Selectinon Sort:- ");
        selectionSort(arr);

        System.out.println("Insertion Sort:- ");
        insertionSort(arr);
    }
}