import java.util.Scanner;
public class SortInAscendingOrder{

    //Print Array
    public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Swaping the Array
    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    //Ascending order Sorting of Array
    public static void sortAscendingOrder(int[] arr, int n){

        System.out.println("\nThe Array sort in Acending Order:- ");

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    swapArray(arr, i , j);
                }
            }
        }
        printArray(arr, n);
    }

    // Desending order Sorting of Array
    public static void sortDesendingOrder(int[] arr, int n){

        System.out.println("\nThe Array sort in Desending Order:- ");

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    swapArray(arr, j, i);
                }
            }
        }
        printArray(arr, n);
    }

    //Main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array size:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //Method calling
        sortAscendingOrder(arr, n);
        sortDesendingOrder(arr, n);
    }
}