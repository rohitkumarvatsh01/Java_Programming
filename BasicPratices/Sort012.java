import java.util.Scanner;
public class Sort012{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void sort012(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
    
        while(mid<=end){
            if(arr[mid]==0){
                swapArray(arr, start, mid);
                start++;
                mid++;
            }
            else  if(arr[mid]==1){
                mid++;
            }
            else{
                swapArray(arr, mid, end);
                end--;
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        sort012(arr);
        printArray(arr);
    } 
}
