import java.util.Scanner;
public class PrintEvenOdd{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void evenOdd(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            if(arr[start]%2==0){
                start++;
            }
            else if(arr[end]%2==1){
                end--;
            }
            else if(arr[start]%2==1 && arr[end]%2==0){
                swapArray(arr, start, end);
                start++;
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

        evenOdd(arr);
        printArray(arr);
    }
}