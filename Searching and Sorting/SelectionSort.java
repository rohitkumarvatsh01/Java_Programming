import java.util.Scanner;
public class SelectionSort{

    //Print the Array
    public static void printArray(int[] arr){
        int n=arr.length;

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Swap the two array element
    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    //Function of Selection Sort
    public static void selectionSort(int[] arr){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int min=i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                swapArray(arr, min, i);
            }
        }
    }

    //Main Function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        selectionSort(arr);
        printArray(arr);
    }
}