import java.util.Scanner;

public class BubbleSort{
    
    public static void printArray(int[] arr){
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swapArray(arr, j, j+1);
                }
                printArray(arr);
                System.out.println();
            }
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();
        
        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Pass of Element Sort in Array:- ");
        bubbleSort(arr);
    }
}