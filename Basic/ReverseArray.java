import java.util.Scanner;

public class ReverseArray{
    
    //Print Array
    static void printArray(int[] arr){
        System.out.println("The Reverse array:- ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Swap Array
    static void swapArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    //Reverse Array
    static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
        
    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of the Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        reverseArray(arr);
        
    }
}