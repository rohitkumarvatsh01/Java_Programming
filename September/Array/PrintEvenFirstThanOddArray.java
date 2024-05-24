import java.util.Scanner;
public class PrintEvenFirstThanOddArray {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swapArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void evenOdd(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            if(arr[start]%2==1 && arr[end]%2==0){
                swapArray(arr, start, end);
                start++;
                end--;
            }
            else if(arr[start]%2==0){
                start++;
            }
            else{
                end--;
            }
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

        evenOdd(arr);
        printArray(arr); 
    }
}
