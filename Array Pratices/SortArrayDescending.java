import java.util.Scanner;
public class SortArrayDescending{

    //Print Array
    public static void printArray(int[] arr){
        System.out.println("The Array Print:- ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Swap the two element
    public static void swapArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //Sort the Array
    public static void sortArray(int[] arr){

        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    swapArray(arr, i, j);
                }
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

        //Function Calling
        sortArray(arr);
        printArray(arr);
    }
}