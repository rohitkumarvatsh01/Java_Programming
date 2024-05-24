import java.util.Scanner;
public class RotateKStepsWithoutExtraSpac {

    //Print Array
    public static void printArray(int[] arr){

        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Reverse the Array
    public static void reverseArray(int[] arr, int i, int j){
    
        while(i<j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    //Rotate the Array in K steps
    public static void roteteKstep(int[] arr, int k){

        int n=arr.length;
        k=k%n;

        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }

    //Main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of K steps:- ");
        int k=sc.nextInt();

        System.out.println("Array Rotate K steps:- ");
        roteteKstep(arr, k);
        printArray(arr);
    }
}
