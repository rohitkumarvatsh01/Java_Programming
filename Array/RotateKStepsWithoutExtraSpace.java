import java.util.Scanner;

public class RotateKStepsWithoutExtraSpace {
    
    //Print the Array
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Swap the Array
    static void swap(int[] arr, int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //Reverse the Array
    static void reverseArray(int[] arr, int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    //Rotate the Array
    static void rotateKSteps(int[] arr, int k){
        int n=arr.length;

        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Value of Kth Steps:- ");
        int k=sc.nextInt();

        rotateKSteps(arr, k);
        printArray(arr);
    }
}
